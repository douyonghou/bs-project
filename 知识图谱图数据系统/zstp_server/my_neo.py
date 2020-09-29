# coding:utf-8

import json

from flask import Flask, render_template

from util import clean_data

app = Flask(__name__)

book_all_list, type_all_list = clean_data.book_all_list(9.9)


print(type_all_list)
data_all = book_all_list + type_all_list

rel_book_type=[]
for book in book_all_list[1:]:
    if len(book) != 2:
        continue
    dict_book = {"source": book['id'], "target": book['data']['labels'][0], "labels": book['data']['property']['type']}
    rel_book_type.append(dict_book)

link_json=json.dumps(rel_book_type, ensure_ascii=False)
data_json=json.dumps(data_all,ensure_ascii=False)


@app.route("/svg", methods=("GET", "POST"))
def svg():
    return render_template("neostudy2.html", NODES_DATA = data_json,NODES_LINK=  link_json )

if __name__ == '__main__':
    app.run(debug=True, host='127.0.0.1', port=5555)
