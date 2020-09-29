package com.stock.servlet;

import com.stock.bean.UserInfoBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class RKXStockServlet extends HttpServlet {
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
		String user = ((UserInfoBean) session.getAttribute("user")).getUserid();
		String stockID = request.getParameter("stockID");
		System.out.println("------------"+stockID);

		request.setAttribute("stockID", stockID);
		request.getRequestDispatcher("/skx.jsp").forward(request,
				response);
	}
}