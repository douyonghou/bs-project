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
	<title>���׼�¼��ѯ--��Ʊ��Ϣϵͳ</title>
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
			<table width="600" border="1" id="con">
				<tr>
					<td colspan="7" nowrap class="tdc"><span id="sp1">��Ʊ����</span>
					</td>
				</tr>
				<tr>
					<td width="81" nowrap class="tdc"><span id="sp2">��Ʊ����</span></td>
					<td width="81" nowrap class="tdc"><span id="sp3">��Ʊ����</span></td>
					<td width="81" nowrap class="tdc"><span id="sp4">���տ��̼�</span></td>
					<td width="81" nowrap class="tdc"><span id="sp5">�������̼�</span></td>
					<td width="81" nowrap class="tdc"><span id="sp6">��߼�</span></td>
					<td width="81" nowrap class="tdc"><span id="sp7">��ͼ�</span></td>
				</tr>
				<%
					List<StockDetailsBean> list = (List<StockDetailsBean>) request
							.getAttribute("list"); //��ѯ�ļ�¼��Ϣ
					if (list != null) {
						for (int i = 0; i < list.size(); i++) { // �Լ�¼��Ϣ��ѭ����ʾ
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