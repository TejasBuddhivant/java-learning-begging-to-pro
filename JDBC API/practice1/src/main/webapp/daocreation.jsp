<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.dao.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
daocreation a= new daocreation();

int num1=23;

a.sqrtofnum(num1);
%>
<%=a.sqrtofnum(num1) %>

</body>
</html>