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
<title>ҵ��˵�--��Ʊ��Ϣϵͳ</title>
<link rel="stylesheet" href="<%=path%>/assets/css/styles.css" />
</head>
<body>
	<form method="post" action="">
		<div id="mainlist">
			<h1>��Ʊ��Ϣϵͳ</h1>
			<div class="mainlist" style="align-content: center">
				<h1>
					<span id="sp1">
						<span id="sp2">
							ѡ��ҵ��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<a href="<%=path%>/servlet/LogoutServlet">�˳�ϵͳ</a>
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
								<a href="<%=path%>/servlet/SearchQueryServlet">���̲�ѯ</a>
							</td>
						</tr>
						<tr>
							<td colspan="2" nowrap class="tdc">&nbsp;</td>
						</tr>

						<tr>
							<td colspan="2" nowrap class="tdc">
								<a href="<%=path%>/servlet/TradeRecordServlet">��Ʊ����</a>
							</td>
						</tr>
						<tr>
							<td colspan="2" nowrap class="tdc">&nbsp;</td>
						</tr>
						<tr>
							<td colspan="2" nowrap class="tdc">
								<a href="<%=path%>/servlet/ManageStockServlet">Ԥ������</a>
							</td>
						</tr>
						<tr>
							<td colspan="2" nowrap class="tdc">&nbsp;</td>
						</tr>
						<tr>
							<td colspan="2" nowrap class="tdc">
								<a href="<%=path%>/servlet/CygpStockServlet">���й�Ʊ</a>
							</td>
						</tr>

						<tr>
							<td colspan="2" nowrap class="tdc">&nbsp;</td>
						</tr>
						<tr>
							<td colspan="2" nowrap class="tdc">
								<a href="<%=path%>/servlet/KXTStockServlet">K��ͼ</a>
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