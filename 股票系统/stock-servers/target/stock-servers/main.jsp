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
			<div class="mainlist" style="align-content: center">
				<h1>
					<span id="sp1">
						<span id="sp2">
							选择业务&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<a href="<%=path%>/servlet/LogoutServlet">退出系统</a>
					</span>
					</span>
				</h1>
				<div style="align-content: center ">
					<table width="250" border="0" id="con1" style="align-content: center">
						<tr>
							<td width="117" nowrap class="tdr"></td>
							<td width="117" nowrap class="tdl"></td>
						</tr>

						<tr>
							<td colspan="2" nowrap class="tdc">&nbsp;</td>
						</tr>
						<tr>
							<td colspan="2" nowrap class="tdc">&nbsp;</td>
						</tr>
						<tr>
							<td colspan="2" nowrap class="tdc">
								<a href="<%=path%>/servlet/SearchQueryServlet">大盘查询</a>
							</td>
						</tr>
						<tr>
							<td colspan="2" nowrap class="tdc">&nbsp;</td>
						</tr>

						<tr>
							<td colspan="2" nowrap class="tdc">
								<a href="<%=path%>/servlet/TradeRecordServlet">股票行情</a>
							</td>
						</tr>
						<tr>
							<td colspan="2" nowrap class="tdc">&nbsp;</td>
						</tr>
						<tr>
							<td colspan="2" nowrap class="tdc">
								<a href="<%=path%>/servlet/ManageStockServlet">预警定制</a>
							</td>
						</tr>
						<tr>
							<td colspan="2" nowrap class="tdc">&nbsp;</td>
						</tr>
						<tr>
							<td colspan="2" nowrap class="tdc">
								<a href="<%=path%>/servlet/CygpStockServlet">持有股票</a>
							</td>
						</tr>

						<tr>
							<td colspan="2" nowrap class="tdc">&nbsp;</td>
						</tr>
						<tr>
							<td colspan="2" nowrap class="tdc">
								<a href="<%=path%>/servlet/KXTStockServlet">K线图</a>
							</td>
						</tr>
						<tr>
							<td colspan="2" nowrap class="tdc">&nbsp;</td>
						</tr>

					</table>
				</div>
			</div>
		</div>
	</form>
</body>
</html>