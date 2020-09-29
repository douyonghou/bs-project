# -*- coding: utf-8 -*-
from django.http import HttpResponse
from django.shortcuts import render
from django.views.decorators import csrf
from util.neo4j_excuter import Neo4jExcuter
from py2neo import Graph , Node ,Relationship

# 插入节点数据，接收POST过来的请求数据
def syz_search_post(request):
    ctx = {}
    if request.POST:
        ctx['res_info'] = '查询三元组成功'

        # 标签
        lable_name = request.POST['insert_1']
        # 节点名称
        node_name = request.POST['insert_2']
        # 属性值
        propertys = request.POST['insert_3'].split(',', -1)
        if len(lable_name) > 0 and len(node_name) > 0:
            ctx['res_info'] = '查询三元组成功'
            list_sys= [ ]
            neo4jExcuter = Neo4jExcuter()
            node = neo4jExcuter.fin_node(lable_name, node_name)
            list = neo4jExcuter.find_rel(node)
            for rel in list[1:]:
                sart_node = node_name
                end_node = rel[0]
                node_rel = rel[1]
                line = {'lable_name':sart_node,'node_name':end_node,'pro':node_rel}
                list_sys.append(line)
            ctx['list_syz'] = list_sys
        else:
            ctx['res_info'] = '查询三元组失败'

    return render(request, "sanyuanzhu-search.html", ctx)