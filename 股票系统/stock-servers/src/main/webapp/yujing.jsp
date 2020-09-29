<%@page import="java.util.List"%>
<%@page import="com.stock.bean.StockInfoBean"%>
<%@page import="com.stock.bean.UserInfoBean"%>
<%@page contentType="text/html;charset=GBK"%>
<%
	String path = request.getContextPath();
	UserInfoBean uib = (UserInfoBean) session.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
<title>业务菜单--股票信息系统</title>
<link rel="stylesheet" href="<%=path%>/assets/css/styles.css" />
</head>
<body>
	<form method="post" action="">
		<div id="mainlist">
			<h1>股票信息系统</h1>
			<div class="mainlist">
				<h1>
					<span id="sp1">
						<span id="sp2">
							预警通知&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<a href="<%=path%>/servlet/LogoutServlet">退出系统</a>
					</span>
					</span>
				</h1>
				<div>
					<table width="550" border="0" id="con2">
						<tr>
							<td colspan="2" nowrap class="tdc">&nbsp;</td>
						</tr>
						<tr>
							<td width="86" nowrap class="tdc">股票编码</td>
							<td width="86" nowrap class="tdc">原价</td>
							<td width="86" nowrap class="tdc">现价</td>
							<td width="86" nowrap class="tdc">购买数量</td>
							<td width="86" nowrap class="tdc">亏损总额</td>

						</tr>
						<%
						List<StockInfoBean> list = (List<StockInfoBean>) request
								.getAttribute("ownlist"); //查询的记录信息
						if (list != null) {
							for (int i = 0; i < list.size(); i++) { // 对记录信息做循环显示
								StockInfoBean si = (StockInfoBean) list.get(i);
								String salelink = path + "/saleStock.jsp?stockid="+ si.getstockId();
					%>
						<tr>
							<td width="86" nowrap class="tdc"><%=si.getstockId()%></td>
						    <td width="86" nowrap class="tdc"><%=si.getStockPrice()%></td>
						    <td width="86" nowrap class="tdc"><%=si.getuser()%></td>
						    <td width="86" nowrap class="tdc"><%=si.getStockNum()%></td>
							<td width="86" nowrap class="tdc"><%=si.getcreateTime()%></td>
					</tr>
					<%
						}
						}
					%>
					</table>
				</div>
			</div>
		</div>
	</form>
</body>
</html>