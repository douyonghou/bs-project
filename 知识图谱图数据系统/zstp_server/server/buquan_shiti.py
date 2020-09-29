# -*- coding: utf-8 -*-
from django.http import HttpResponse
from django.shortcuts import render
from django.views.decorators import csrf
from util.neo4j_excuter import Neo4jExcuter
from py2neo import Graph , Node ,Relationship

# 节点数据，接收POST过来的请求数据
def buqian_shiti_post(request):
    ctx = {}
    if request.POST:
        ctx['res_info'] = '创建成功'
        # 节点1
        node_1 = request.POST['bu_quan_ST_1']
        # 节点2
        node_2 = request.POST['bu_quan_ST_2']
        # 关系
        rel = request.POST['bu_quan_ST_3']
        ctx['node_1'] = node_1
        ctx['node_2'] = node_2
        ctx['rel'] = rel

        if len(node_1.split(',',-1)) > 1 and len(node_2.split(',',-1)) > 1:
            lable_1 = node_1.split(",",-1)[0]
            name_1 = node_1.split(",",-1)[1]

            lable_2 = node_2.split(",", -1)[0]
            name_2 = node_2.split(",",-1)[1]

            neo4jExcuter = Neo4jExcuter()
            # 判断标签和节点名称值是否成功

            if len(node_2.split(",")) >= 2 and len(node_2.split(",")) >= 2 and len(rel) > 0:

                node1 = Node(lable_1, name = name_1)

                node2 = Node(lable_2, name = name_2)
                neo4jExcuter.create_relationship(node1, rel, node2)
            else:
                ctx['res_info'] = '创建失败失败,输入数据错误！'
        else:
            ctx['res_info'] = '创建失败失败,输入数据错误！'
    return render(request, "buquan_node.html", ctx)