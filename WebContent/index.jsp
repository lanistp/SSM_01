<%@page import="com.sun.xml.internal.bind.CycleRecoverable.Context"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%  
	pageContext.setAttribute("ctg", request.getContextPath());
%>
</head>
<body>
	<a href="${ctg }/getTeacher?id=1">getTeacher</a>
	<a href="${ctg }/handle_01">handle_01</a>
</body>
</html>
