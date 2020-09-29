from django.conf.urls import url
from django.urls import path
 
import zstp_server.wiews as shou_wiews
from server import insert_node, delete_node, buquan_shiti, shiti_search, syz_search

urlpatterns = [
    path('hello/', shou_wiews.hello),
    path('index/', shou_wiews.index,name='index'),
    # 插入节点
    path('insert/', shou_wiews.insert,name='insert'),
    # 删除节点
    path('delete/', shou_wiews.delete,name='delete'),
    # 三元组查询
    path('sanyuanzhu_search/', shou_wiews.sanyuanzhu_search,name='sanyuanzhu_search'),
    # 实体查询
    path('shiti_search/', shou_wiews.shiti_search,name='shiti_search'),
    #节点补全
    path('buquan_node/', shou_wiews.buquan_node,name='buquan_node'),
    #节点图谱buquan_node
    path('buquan_tupu/', shou_wiews.buquan_tupu,name='buquan_tupu'),
    #欢迎界面
    path('welcome/', shou_wiews.welcome,name='welcome'),

    # 插入节点
    path('insert_post/',insert_node.insert_post),

    # 删除节点
    path('delete_post/',delete_node.delete_post),

    # 创建关系
    path('buqian_shiti_post/',buquan_shiti.buqian_shiti_post),

    # 实体查询
    path('shiti_search_post/',shiti_search.shiti_search_post),

    # 三元组查询
    path('syz_search_post/', syz_search.syz_search_post),
]