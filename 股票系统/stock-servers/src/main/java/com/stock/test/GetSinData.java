package com.stock.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetSinData {
    //股票名称
    String name;
    //今日开盘价；
    String todayStartPrice;
    //昨日收盘价
    String dtYesterDayPrice;
    //当前价格
    String nowPrice;
    //今日最高价
    String maxPrice;
    //今日最低价
    String minPrice;
    //成交的股票数
    String stockNum;
    //成交金额
    String dealTotal;

    public int captureHtml(String stockID) throws Exception {
        String strURL = "http://hq.sinajs.cn/list="+ stockID;
        URL url = new URL(strURL);
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        InputStreamReader input = new InputStreamReader(httpConn.getInputStream());
        BufferedReader bufReader = new BufferedReader(input);
        String line = "";
        StringBuilder contentBuf = new StringBuilder();

        line = bufReader.readLine().split("=")[1].replace("\"","");
        if(line.split(",").length<10) return -999;

        this.name=line.split(",")[0];
        if(this.name == null) return -999;
        //今日开盘价；
        this.todayStartPrice=line.split(",")[1];
        if(this.todayStartPrice == null) return -999;
        //昨日收盘价
        this.dtYesterDayPrice=line.split(",")[2];
        if(this.dtYesterDayPrice == null) return -999;
        //当前价格
        this.nowPrice=line.split(",")[3];
        if(this.nowPrice == null) return -999;
        //今日最高价
        this.maxPrice=line.split(",")[4];
        if(this.maxPrice == null) return -999;
        //今日最低价
        this.minPrice=line.split(",")[5];
        if(this.minPrice == null) return -999 ;
        //成交的股票数
        this.stockNum=line.split(",")[8];
        if(this.stockNum == null) return -999 ;
        //成交金额
        this.dealTotal=line.split(",")[9];
        if(this.dealTotal == null) return -999 ;

        if(line.split(",").length<10){
            return -999;
        }else {
            return 0;
        }

    }

    public String getName() {
        return name;
    }

    public String getTodayStartPrice() {
        return todayStartPrice;
    }

    public String getDtYesterDayPrice() {
        return dtYesterDayPrice;
    }

    public String getNowPrice() {
        return nowPrice;
    }

    public String getMaxPrice() {
        return maxPrice;
    }

    public String getMinPrice() {
        return minPrice;
    }

    public String getStockNum() {
        return stockNum;
    }

    public String getDealTotal() {
        return dealTotal;
    }

    public static void main(String[] args) throws Exception {
        GetSinData getSinData=new GetSinData();
        getSinData.captureHtml("sh601006");
        System.out.println(getSinData.getName());
    }
}
