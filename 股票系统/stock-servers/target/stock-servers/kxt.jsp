<%@page import="com.stock.bean.UserInfoBean"%>
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
<script type="text/javascript">
	function huoqu(){
		var stockID=document.getElementsByName("stockID").values()
		out.print(stockID)
	}
</script>
<body>
<form method="post" action="FSKXStockServlet">
	<div id="mainlist">
		<h1>��Ʊ��Ϣϵͳ</h1>
		<div class="mainlist">
			<h1>
					<span id="sp"> <a href="<%=path%>/servlet/MainServlet">������ҳ</a>
						&nbsp;&nbsp;&nbsp;&nbsp;��ӭ����<%=uib.getName()%>&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="<%=path%>/servlet/LogoutServlet">�˳�ϵͳ</a>
					</span>
			</h1>

			<br>
			<br>
			<input type="text" name="stockID" value="">
			<br>
			<br>
			<tr>
				<td colspan="2" nowrap class="tdc">
					<input type="submit" href="<%=path%>/servlet/FSKXStockServlet" value="��ѯ">
				</td>
			</tr>
			<br>
			<br>
		</div>
	</div>
</form>
</body>
</html>