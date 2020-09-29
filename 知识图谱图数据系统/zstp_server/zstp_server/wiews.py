from django.http import HttpResponse
from django.shortcuts import render


def hello(request):
    return HttpResponse("Hello world ! ")

def index(request):
    context          = {}
    # context['hello'] = 'Hello World!'
    return render(request, 'index.html', context)
def insert(request):
    context          = {}
    # context['hello'] = 'Hello World!'
    return render(request, 'insert-node.html', context)

# 删除节点
def delete(request):
    context          = {}
    # context['hello'] = 'Hello World!'
    return render(request, 'shiti_delete.html', context)

# 三元组查询
def sanyuanzhu_search(request):
    context = {}
    # context['hello'] = 'Hello World!'
    return render(request, 'sanyuanzhu-search.html', context)

# 实体查询
def shiti_search(request):
    context = {}
    # context['hello'] = 'Hello World!'
    return render(request, 'shiti_search.html', context)

# 节点补全buquan_node
def buquan_node(request):
    context = {}
    # context['hello'] = 'Hello World!'
    return render(request, 'buquan_node.html', context)

# 图谱补全图谱_node
def buquan_tupu(request):
    context = {}
    # context['hello'] = 'Hello World!'
    return render(request, 'buquan_tupu.html', context)


# 欢迎界面
def welcome(request):
    context = {}
    # context['hello'] = 'Hello World!'
    return render(request, 'welcome.html', context)
