package com.stock.servlet;

import com.stock.bean.StockInfoBean;
import com.stock.bean.UserInfoBean;
import com.stock.model.StockQueryModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class KXTStockServlet extends HttpServlet {
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
		StockQueryModel sqm = new StockQueryModel();
		List<StockInfoBean> list = new ArrayList<StockInfoBean>();
		try {
			System.out.println(user);
			list = sqm.getOwnStock(user);
			System.out.println(list.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

		request.setAttribute("ownlist", list);
		request.getRequestDispatcher("/kxt.jsp").forward(request,
				response);
	}
}