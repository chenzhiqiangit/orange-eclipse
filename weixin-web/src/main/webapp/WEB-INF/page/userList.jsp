<!DOCTYPE HTML>
<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<base href="<%=basePath%>">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<title>My JSP 'userList.jsp' starting page</title>
<script type="text/javascript">
	function synchronLocation(){
		form1.submit();
	}
</script>
 </head>
  <body>
  	<table>
  		<c:forEach var="user" items="${userList}">
  			<tr><td>
 				${user.company}
 			</td></tr>
 		</c:forEach>
  	</table>
 	<form id="form1" action="user/locationSynchron" method="post" >
 		<input type="text" name="username" id="username" />
 		<button id="bnt1" onclick="synchronLocation()">同步地点</button>
 	</form>
  </body>
</html>
