/**
 * 文件名：StockInfo.java
 * 所属包名：com.stock.bean
 * 所属项目名：StockSystem
 */
package com.stock.bean;

public class StockInfoBean {
	private String user;
	private String stockId;
	private String createTime;
	private String stockPrice;
	private String stockNum;

	public StockInfoBean() {
		super();
	}

	/**
	 * @param user
	 * @param stockId
	 * @param createTime
	 * @param stockPrice
	 * @param stockNum
	 */
	public StockInfoBean(String user, String stockId, String createTime,
						 String stockPrice, String stockNum) {
		super();
		this.user = user;
		this.stockId = stockId;
		this.createTime = createTime;
		this.stockPrice = stockPrice;
		this.stockNum=stockNum;
	}

	/**
	 * @return user
	 */
	public String getuser() {
		return user;
	}

	/**
	 * @param user
	 *            要设置的 user
	 */
	public void setuser(String user) {
		this.user = user;
	}

	/**
	 * @return stockId
	 */
	public String getstockId() {
		return stockId;
	}

	/**
	 * @param stockId
	 *            要设置的 stockId
	 */
	public void setstockId(String stockId) {
		this.stockId = stockId;
	}

	/**
	 * @return createTime
	 */
	public String getcreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 *            要设置的 createTime
	 */
	public void setcreateTime(String createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return stockPrice
	 */
	public String getStockPrice() {
		return stockPrice;
	}

	/**
	 * @param stockPrice
	 *            要设置的 stockPrice
	 */
	public void setStockPrice(String stockPrice) {
		this.stockPrice = stockPrice;
	}

	/**
	 * @return stockNum
	 */
	public String getStockNum() {
		return stockNum;
	}

	/**
	 * @param stockNum
	 *            要设置的 stockNum
	 */
	public void setStockNum(String stockNum) {
		this.stockNum = stockNum;
	}

	@Override
	public String toString() {
		return "StockInfoBean{" +
				"user='" + user + '\'' +
				", stockId='" + stockId + '\'' +
				", createTime='" + createTime + '\'' +
				", stockPrice='" + stockPrice + '\'' +
				", stockNum='" + stockNum + '\'' +
				'}';
	}
}