package com.stock.bean;

public class StockDetailsBean {
   private String stockID;
   private String stockName;
   private String stockTodayStartPrice;
   private String stockDtYesterDayPrice;
   private String stockMaxPrice;
   private String stockMinPrice;
   private String nowPrice;

    public StockDetailsBean(String stockID, String stockName, String stockTodayStartPrice, String stockDtYesterDayPrice, String stockMaxPrice, String stockMinPrice, String nowPrice) {
        this.stockID = stockID;
        this.stockName = stockName;
        this.stockTodayStartPrice = stockTodayStartPrice;
        this.stockDtYesterDayPrice = stockDtYesterDayPrice;
        this.stockMaxPrice = stockMaxPrice;
        this.stockMinPrice = stockMinPrice;
        this.nowPrice = nowPrice;
    }

    public String getNowPrice() {
        return nowPrice;
    }

    public void setNowPrice(String nowPrice) {
        this.nowPrice = nowPrice;
    }

    @Override
    public String toString() {
        return "StockDetailsBean{" +
                "stockID='" + stockID + '\'' +
                ", stockName='" + stockName + '\'' +
                ", stockTodayStartPrice='" + stockTodayStartPrice + '\'' +
                ", stockDtYesterDayPrice='" + stockDtYesterDayPrice + '\'' +
                ", stockMaxPrice='" + stockMaxPrice + '\'' +
                ", stockMinPrice='" + stockMinPrice + '\'' +
                '}';
    }

    public StockDetailsBean() {
    }

    public void setStockID(String stockID) {
        this.stockID = stockID;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public void setStockTodayStartPrice(String stockTodayStartPrice) {
        this.stockTodayStartPrice = stockTodayStartPrice;
    }

    public void setStockDtYesterDayPrice(String stockDtYesterDayPrice) {
        this.stockDtYesterDayPrice = stockDtYesterDayPrice;
    }

    public void setStockMaxPrice(String stockMaxPrice) {
        this.stockMaxPrice = stockMaxPrice;
    }

    public void setStockMinPrice(String stockMinPrice) {
        this.stockMinPrice = stockMinPrice;
    }

    public String getStockID() {
        return stockID;
    }

    public String getStockName() {
        return stockName;
    }

    public String getStockTodayStartPrice() {
        return stockTodayStartPrice;
    }

    public String getStockDtYesterDayPrice() {
        return stockDtYesterDayPrice;
    }

    public String getStockMaxPrice() {
        return stockMaxPrice;
    }

    public String getStockMinPrice() {
        return stockMinPrice;
    }
}
