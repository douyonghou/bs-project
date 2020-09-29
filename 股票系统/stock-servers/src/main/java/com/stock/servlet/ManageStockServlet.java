package com.stock.servlet;

import com.stock.bean.StockInfoBean;
import com.stock.bean.UserInfoBean;
import com.stock.model.StockQueryModel;
import com.stock.test.GetSinData;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ManageStockServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=GBK");
		HttpSession session = request.getSession();
		String user = ((UserInfoBean) session.getAttribute("user"))
				.getUserid();
		System.out.println(user);
		StockQueryModel sqm = new StockQueryModel();
		List<StockInfoBean> list = new ArrayList<StockInfoBean>();
		try {
			System.out.println(user);
			list = sqm.getOwnStock(user);
			for(int i=0; i<list.size();i++){
				StockInfoBean stockInfoBean=list.get(i);
				// 总额
				double tolle=Integer.parseInt(stockInfoBean.getStockNum())*Double.parseDouble(stockInfoBean.getStockPrice());
//				stockInfoBean.setcreateTime(tolle+"");

				// 现价
				GetSinData getSinData=new GetSinData();
				getSinData.captureHtml("sh"+stockInfoBean.getstockId());
				double nowPrice=Double.parseDouble(getSinData.getNowPrice());
				stockInfoBean.setuser(nowPrice+"");

				// 亏损
				double kuisun=tolle-Integer.parseInt(stockInfoBean.getStockNum())*nowPrice;
				stockInfoBean.setcreateTime(kuisun+"");

				list.set(i,stockInfoBean);
				System.out.println(list.toString());
				if(kuisun < 0){//没有亏本，不警告
					list.remove(i);
				}


			}
			System.out.println(list.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

		request.setAttribute("ownlist", list);
		request.getRequestDispatcher("/yujing.jsp").forward(request,
				response);
	}
}