# -*- coding: utf-8 -*-
from django.http import HttpResponse
from django.shortcuts import render
from django.views.decorators import csrf
from util.neo4j_excuter import Neo4jExcuter
from py2neo import Graph , Node ,Relationship

# 插入节点数据，接收POST过来的请求数据
def delete_post(request):
    ctx = {}
    if request.POST:
        ctx['res_info'] = '删除成功'

        # 标签
        lable_name = request.POST['delete_1']
        # 节点名称
        node_name = request.POST['delete_2']
        # 属性值
        propertys = request.POST['delete_3'].split(',',-1)
    # return render(request, "shiti_delete.html", ctx)

        ctx['lable_name'] = lable_name
        ctx['node_name'] = node_name
        ctx['properties'] = propertys
        neo4jExcuter = Neo4jExcuter()
        # 判断标签和节点名称值是否成功
        print(lable_name, node_name, propertys)
        if lable_name is not '' and node_name is not '':
            node = neo4jExcuter.fin_node(lable_name, node_name)
            print(node)
            # 删除节点
            flag = neo4jExcuter.dele_node(node)
            if flag == 999:
                ctx['res_info'] = '删除失败'
        else:
            ctx['res_info'] = '删除失败'
    return render(request, "shiti_delete.html", ctx)
    # render(request, "insert-node.html", ctx)
    # render(request, "insert-node.html", ctx)
    # return HttpResponse("<p>数据添加成功！</p>")