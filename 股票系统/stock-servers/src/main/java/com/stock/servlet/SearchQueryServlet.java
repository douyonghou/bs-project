package com.stock.servlet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stock.bean.StockDetailsBean;
import com.stock.bean.StockInfoBean;
import com.stock.model.StockQueryModel;
import com.stock.test.GetSinData;

public class SearchQueryServlet extends HttpServlet {

	private static ArrayList<String> stockIdSH = new ArrayList<String>();
	public static void lodeCodeList() throws IOException {

		BufferedReader reader = reader = new BufferedReader(new FileReader("D:\\360MoveData\\Users\\doubi\\Desktop\\bs_20200518\\stock-servers\\src\\main\\java\\com\\stock\\servlet\\code_list"));
		String line = null;
		while (true) {
			if (!((line = reader.readLine()) != null)) break;
			stockIdSH.add(line);
		}
		reader.close();
	}

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=GBK");
		lodeCodeList();
		StockDetailsBean sqm = null;
		List<StockDetailsBean> list = new ArrayList<StockDetailsBean	>();
		GetSinData getSinData=new GetSinData();
			for (String stockId : SearchQueryServlet.stockIdSH) {
				try {
					getSinData.captureHtml("sh"+stockId);
				} catch (Exception e) {
					e.printStackTrace();
				}
				sqm = new StockDetailsBean();
//				sqm.setStockID(stockId.replaceAll("[a-z]",""));

				sqm = new StockDetailsBean();
				sqm.setStockID(stockId);
				sqm.setStockName(getSinData.getName());
				sqm.setStockTodayStartPrice(getSinData.getTodayStartPrice());
				sqm.setStockDtYesterDayPrice(getSinData.getDtYesterDayPrice());
				sqm.setStockMaxPrice(getSinData.getMaxPrice());
				sqm.setStockMinPrice(getSinData.getMinPrice());
				sqm.setNowPrice(getSinData.getNowPrice());
				System.out.println(sqm.toString());
				list.add(sqm);
			}

			request.setAttribute("list", list);
			request.getRequestDispatcher("../searchQuery.jsp").forward(request,
					response);

	}
}