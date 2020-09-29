# coding=utf-8
import json

def type_all_list():
    type_all_list = []
    for line in open(r'E:\bs_20200606\zstp_server\data\book_type.csv', encoding='utf-8'):
        name = line.strip().split(',',-1)[1]
        lable = line.strip().split(',',-1)[0]
        dict = {"id": name, "data": {"labels": [lable],  "property": {"name": name}}}
        type_all_list.append(dict)
    return type_all_list
    # str_list = ','.join('%s' %id for id in type_all_list)
    # open('../data/book_type_node.json','w').write(str_list)

def book_all_list(source_num):
    type_all_list = []
    book_all_list = []
    k =0
    for line in open(r'E:\bs_20200606\zstp_server\data\book_all.csv', encoding='utf-8'):

        if line.strip().split(',',-1).__len__() != 7 :
            continue
        name = line.strip().split(',',-1)[1]
        lable = line.strip().split(',',-1)[6]
        source = line.strip().split(',',-1)[2]


        if not source.replace('.','').isdigit() or float(source) < source_num or source == '评分'or k == 15 or lable == 'type':
            continue
        k = k+1
        dict_type = {"id": lable, "data": {"labels": ['type'], "property": {"name": lable, "type":'type'}}}
        type_all_list.append(dict_type)
        dict = {"id": name, "data": {"labels": [lable],  "property": {"name": name, "type":source}}}
        book_all_list.append(dict)
    # [i for n, i in enumerate(type_all_list) if i not in type_all_list[:n]]
    return book_all_list , [i for n, i in enumerate(type_all_list) if i not in type_all_list[:n]]
    # str_list = ','.join('%s' %id for id in book_all_list)
    # open('../data/book_all_node.json','w', encoding='utf-8').write(str_list)


