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
	<title>���۹�Ʊ--��Ʊ��Ϣϵͳ</title>
	<link rel="stylesheet" href="<%=path%>/assets/css/styles.css" />
</head>

<body>
<form method="post" action="">
	<div id="mainlist">
		<h1>��Ʊ��Ϣϵͳ</h1>
		<div class="mainlist">
			<h1>
					<span id="sp"> <a href="<%=path%>/servlet/MainServlet">������ҳ</a>
						&nbsp;&nbsp;&nbsp;&nbsp;��ӭ����<%=uib.getName()%>&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="<%=path%>/servlet/LogoutServlet">�˳�ϵͳ</a>
					</span>
			</h1>

			<%
				String stockID = (String) request.getAttribute("stockID");
			%>
			<br>
			<br>
			<tr>
				<td colspan="2" nowrap class="tdc">
					<a type="submit" href="<%=path%>/servlet/SKXStockServlet?stockID=<%=stockID%>" >ʱK��</a>
				</td>
			</tr>


			<br>
			<br>
			<tr>
				<td colspan="2" nowrap class="tdc">
					<a type="submit" href="<%=path%>/servlet/RKXStockServlet?stockID=<%=stockID%>" >��K��</a>
				</td>
			</tr>

			<br>
			<br>
			<tr>
				<td colspan="2" nowrap class="tdc">
					<a type="submit" href="<%=path%>/servlet/ZKXStockServlet?stockID=<%=stockID%>" >��K��</a>
				</td>
			</tr>

			<br>
			<br>
			<tr>
				<td colspan="2" nowrap class="tdc">
					<a type="submit" href="<%=path%>/servlet/YKXStockServlet?stockID=<%=stockID%>" >��K��</a>
				</td>
			</tr>

			<br>
			<br>

		</div>
	</div>
</form>
</body>
</html>