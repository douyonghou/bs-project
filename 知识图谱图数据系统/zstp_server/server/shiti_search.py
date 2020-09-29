# -*- coding: utf-8 -*-
from django.http import HttpResponse
from django.shortcuts import render
from django.views.decorators import csrf
from util.neo4j_excuter import Neo4jExcuter
from py2neo import Graph , Node ,Relationship

# 插入节点数据，接收POST过来的请求数据
def shiti_search_post(request):
    ctx = {}
    if request.POST:
        ctx['res_info'] = '查询成功'
        # 标签
        print('iiiiiiiiiifkdsldfffffffffffffffffffffffffffffffffffffffffffffffff')
        lable_name = request.POST['insert_1']

        if len(lable_name.split('.',-1)) > 1:

            ctx['lable_name'] = lable_name.split('.',-1)[0]
            ctx['node_name'] = lable_name.split('.', -1)[1]


            neo4jExcuter = Neo4jExcuter()
            node = neo4jExcuter.fin_node(lable_name.split('.',-1)[0],lable_name.split('.', -1)[1])
            ctx['pro'] = node['propertys']
        else:
            ctx['res_info'] = '查询失败，请输入正确数据！'
    return render(request, "shiti_search.html", ctx)