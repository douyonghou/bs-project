<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>今日食谱</title>
  </head>
  
  <body>


<table style="width:100%;border:1px white solid">
    <tr bgcolor="#4F81BD"style="color: #fff;">
        <th style="text-align: center">时间</th>
        <th style="text-align: center">食谱</th>

    </tr>
    <c:forEach items="${todayRecis}" var="todayReci" varStatus="status">
        <tr bgcolor="${status.index%2 == 0?'#D0D8E8':'#E9EDF4'}">         
            <td align="center">${todayReci.gettodayReciTime()}</td>
             <td align="center">${todayReci.gettodayReciName()}</td>

        </tr>
    </c:forEach>
</table>






  </body>
</html>
