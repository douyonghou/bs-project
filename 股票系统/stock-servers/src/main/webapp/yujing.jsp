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
			<div class="mainlist">
				<h1>
					<span id="sp1">
						<span id="sp2">
							Ԥ��֪ͨ&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<a href="<%=path%>/servlet/LogoutServlet">�˳�ϵͳ</a>
					</span>
					</span>
				</h1>
				<div>
					<table width="550" border="0" id="con2">
						<tr>
							<td colspan="2" nowrap class="tdc">&nbsp;</td>
						</tr>
						<tr>
							<td width="86" nowrap class="tdc">��Ʊ����</td>
							<td width="86" nowrap class="tdc">ԭ��</td>
							<td width="86" nowrap class="tdc">�ּ�</td>
							<td width="86" nowrap class="tdc">��������</td>
							<td width="86" nowrap class="tdc">�����ܶ�</td>

						</tr>
						<%
						List<StockInfoBean> list = (List<StockInfoBean>) request
								.getAttribute("ownlist"); //��ѯ�ļ�¼��Ϣ
						if (list != null) {
							for (int i = 0; i < list.size(); i++) { // �Լ�¼��Ϣ��ѭ����ʾ
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