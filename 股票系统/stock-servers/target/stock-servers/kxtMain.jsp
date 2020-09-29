<%@page import="com.stock.bean.UserInfoBean"%>
<%@ page import="java.util.List" %>
<%@page contentType="text/html;charset=GBK"%>
<%
	String path = request.getContextPath();
	UserInfoBean uib = (UserInfoBean) session.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
	<title>出售股票--股票信息系统</title>
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

			<%
				String stockID = (String) request.getAttribute("stockID");
			%>
			<br>
			<br>
			<tr>
				<td colspan="2" nowrap class="tdc">
					<a type="submit" href="<%=path%>/servlet/SKXStockServlet?stockID=<%=stockID%>" >时K线</a>
				</td>
			</tr>


			<br>
			<br>
			<tr>
				<td colspan="2" nowrap class="tdc">
					<a type="submit" href="<%=path%>/servlet/RKXStockServlet?stockID=<%=stockID%>" >日K线</a>
				</td>
			</tr>

			<br>
			<br>
			<tr>
				<td colspan="2" nowrap class="tdc">
					<a type="submit" href="<%=path%>/servlet/ZKXStockServlet?stockID=<%=stockID%>" >周K线</a>
				</td>
			</tr>

			<br>
			<br>
			<tr>
				<td colspan="2" nowrap class="tdc">
					<a type="submit" href="<%=path%>/servlet/YKXStockServlet?stockID=<%=stockID%>" >月K线</a>
				</td>
			</tr>

			<br>
			<br>

		</div>
	</div>
</form>
</body>
</html>