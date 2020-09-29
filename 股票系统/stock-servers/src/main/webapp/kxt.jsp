<%@page import="com.stock.bean.UserInfoBean"%>
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
<script type="text/javascript">
	function huoqu(){
		var stockID=document.getElementsByName("stockID").values()
		out.print(stockID)
	}
</script>
<body>
<form method="post" action="FSKXStockServlet">
	<div id="mainlist">
		<h1>股票信息系统</h1>
		<div class="mainlist">
			<h1>
					<span id="sp"> <a href="<%=path%>/servlet/MainServlet">返回主页</a>
						&nbsp;&nbsp;&nbsp;&nbsp;欢迎您：<%=uib.getName()%>&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="<%=path%>/servlet/LogoutServlet">退出系统</a>
					</span>
			</h1>

			<br>
			<br>
			<input type="text" name="stockID" value="">
			<br>
			<br>
			<tr>
				<td colspan="2" nowrap class="tdc">
					<input type="submit" href="<%=path%>/servlet/FSKXStockServlet" value="查询">
				</td>
			</tr>
			<br>
			<br>
		</div>
	</div>
</form>
</body>
</html>