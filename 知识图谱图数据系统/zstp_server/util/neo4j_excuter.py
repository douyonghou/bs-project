# coding=utf-8
from py2neo import Graph, Node, Relationship, Transaction


class Neo4jExcuter(object):
    def __init__(self):
        link = Graph("http://127.0.0.1//:7474", user="neo4j", password="123456")
        self.graph = link
        # 定义label
        self.invoice_name = ''
        self.invoice_value = ''
        # node = Node('persion', name='dyh' )
        # find_node = self.graph.find_one('persion', "propertys",["1","2","3"])
        # print(find_node)
        # for rel in self.graph.match(start_node=find_node, rel_type=None, end_node= None, bidirectional=False, limit=None):
        #     print(rel.type())
        #     self.graph.delete(rel)
        #     self.graph.delete(find_node)

        # # 创建关系
        # n1 = Node('persion', name = '学生')
        # n2 = Node('persion', name='老师')
        # pe=Relationship(n1, '数学', n2)
        # self.graph.create(pe)

    # 删除节点
    def dele_node(self,node):
        # 先删除节点的关系
        self.del_rel(node)

        # 在删除节点
        try:
            self.graph.delete(node)
            return 0
        except:
            print('删除失败')
            return 999

    def fin_node (self,lables,name):
        find_node = self.graph.find_one(lables, 'name', name)
        return find_node
    # 删除节点的关系
    def del_rel(self,node):
        for rel in self.graph.match(start_node=node, rel_type=None, end_node=None, bidirectional=False,limit=None):
            self.graph.delete(rel)

    # 查找点的关系
    def find_rel(self, node):
        list = [[]]
        for rel in self.graph.match(start_node=node, rel_type=None, end_node=None, bidirectional=False, limit=None):
            # print(rel.type())
            list.append([rel.end_node()['name'],rel.type()])
        print(list)
        return list
    # 创建关系
    def create_relationship(self,node_1,relation,node_2):
        relationship=Relationship(node_1, relation, node_2)
        self.graph.create(relationship)

    # csv导入neo4j
    def csv_to_neo4j(self, path):

        with open(path, encoding='utf-8') as file:
            for line in file:
                print(line)
                # 标签
                lable = line.split(',',-1)[0]
                print(lable)
                # 名称
                name = line.split(',',-1)[1]
                # 属性
                # properties = line.split(',', -1)[2]
                print(name)
                node = Node(lable, name = name)
                self.graph.create(node)
if __name__ == '__main__':
    print('------')
    neo4jExcuter = Neo4jExcuter()
    # neo4jExcuter.csv_to_neo4j(r'E:\bs_20200606\zstp_server\data\book_type.csv')
    node=neo4jExcuter.fin_node('persion','ykx')
    print(node['propertys'])
