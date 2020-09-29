<%@page import="com.stock.bean.TradeRecordBean"%>
<%@page import="com.stock.bean.UserInfoBean"%>
<%@page import="java.util.List"%>
<%@page import="com.stock.bean.StockInfoBean"%>
<%@ page import="com.stock.bean.StockDetailsBean" %>
<%@page contentType="text/html;charset=GBK"%>
<%
	String path = request.getContextPath();
	UserInfoBean uib = (UserInfoBean) session.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
	<title>交易记录查询--股票信息系统</title>
	<link rel="stylesheet" href="<%=path%>/assets/css/styles.css" />
</head>
<body>
<form method="post" action="">
	<div id="mainlist">
		<h1>股票信息系统</h1>
		<div class="mainlist">
			<h1>
					<span id="sp"> <a href="<%=path%>/servlet/MainServlet">返回主页</a>
						&nbsp;&nbsp;&nbsp;&nbsp;欢迎您：<%=uib.getName()%>&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="<%=path%>/servlet/LogoutServlet">退出系统</a>
					</span>
			</h1>
			<table width="600" border="1" id="con">
				<tr>
					<td colspan="7" nowrap class="tdc"><span id="sp1">股票行情</span>
					</td>
				</tr>
				<tr>
					<td width="81" nowrap class="tdc"><span id="sp2">股票编码</span></td>
					<td width="81" nowrap class="tdc"><span id="sp3">股票名称</span></td>
					<td width="81" nowrap class="tdc"><span id="sp4">今日开盘价</span></td>
					<td width="81" nowrap class="tdc"><span id="sp5">昨日收盘价</span></td>
					<td width="81" nowrap class="tdc"><span id="sp6">最高价</span></td>
					<td width="81" nowrap class="tdc"><span id="sp7">最低价</span></td>
				</tr>
				<%
					List<StockDetailsBean> list = (List<StockDetailsBean>) request
							.getAttribute("list"); //查询的记录信息
					if (list != null) {
						for (int i = 0; i < list.size(); i++) { // 对记录信息做循环显示
							StockDetailsBean trb = (StockDetailsBean) list.get(i);
				%>
				<tr>
					<td nowrap class="tdc"><%=trb.getStockID()%></td>
					<td nowrap class="tdc"><%=trb.getStockName()%></td>
					<td nowrap class="tdc"><%=trb.getStockTodayStartPrice()%></td>
					<td nowrap class="tdc"><%=trb.getStockDtYesterDayPrice()%></td>
					<td nowrap class="tdc"><%=trb.getStockMaxPrice()%></td>
					<td nowrap class="tdc"><%=trb.getStockMinPrice()%></td>
				</tr>
				<%
						}
					}
				%>
			</table>
			<br /> <br />
		</div>
	</div>
</form>
</body>
</html>