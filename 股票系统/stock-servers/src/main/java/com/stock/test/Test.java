package com.stock.test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        String s="fasf23232";
        String a=s.replaceAll("[a-z]","");
        System.out.println(a);

        ArrayList arr=new ArrayList();
        arr.add("fasf");
        arr.add("aaa");
        System.out.println(arr.get(0));

    }
}
