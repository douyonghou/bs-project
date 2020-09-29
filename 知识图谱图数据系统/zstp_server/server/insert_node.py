# -*- coding: utf-8 -*-
from django.http import HttpResponse
from django.shortcuts import render
from django.views.decorators import csrf
from util.neo4j_excuter import Neo4jExcuter
from py2neo import Graph , Node ,Relationship

# 插入节点数据，接收POST过来的请求数据
def insert_post(request):
    ctx = {}
    if request.POST:
        ctx['res_info'] = '添加成功'

        # 标签
        lable_name = request.POST['insert_1']
        # 节点名称
        node_name = request.POST['insert_2']
        # 属性值
        propertys = request.POST['insert_3'].split(',',-1)


        ctx["lable_name"] = lable_name
        ctx["node_name"] = node_name
        ctx["properties"] = propertys

        # 判断标签和节点名称值是否成功
        if lable_name is not '' and node_name is not '' and propertys is not '':
            neo4jExcuter = Neo4jExcuter()
            node = Node(lable_name, name = node_name, propertys = propertys )
            neo4jExcuter.graph.create(node)
        elif lable_name is not '' and node_name is not '':
            node = Node(lable_name, name=node_name)
        else:
            ctx['res_info'] = '添加失败'
    return render(request, "insert-node.html", ctx)
    # render(request, "insert-node.html", ctx)
    # render(request, "insert-node.html", ctx)
    # return HttpResponse("<p>数据添加成功！</p>")