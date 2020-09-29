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
	<title>ʵʱ�ɼ۲�ѯ--��Ʊ��Ϣϵͳ</title>
	<link rel="stylesheet" href="<%=path %>/assets/css/styles.css" />
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
			<table border="0" id="con">
				<tr>
					<td colspan="3" nowrap class="tdc"><span id="sp">ʵʱ�ɼ۲�ѯ</span>
					</td>

				</tr>
				<tr>
					<td width="195" nowrap class="tdc"><span id="sp">��Ʊ����</span>
					</td>
					<td width="195" nowrap class="tdc"><span id="sp">��Ʊ����</span>
					</td>
					<td width="196" nowrap class="tdc"><span id="sp">���µ���</span>
					</td>
				</tr>
				<%
					List<StockDetailsBean> list = (List<StockDetailsBean>) request
							.getAttribute("list"); //��ѯ�ļ�¼��Ϣ
					if (list != null) {
						for (int i = 0; i < list.size(); i++) { // �Լ�¼��Ϣ��ѭ����ʾ
							StockDetailsBean si = (StockDetailsBean) list.get(i);
				%>
				<tr>
					<td nowrap class="tdc"><%=si.getStockID()%></td>
					<td nowrap class="tdc"><%=si.getStockName()%></td>
					<td nowrap class="tdc"><%=si.getNowPrice()%></td>
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