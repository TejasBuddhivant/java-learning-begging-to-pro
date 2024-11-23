<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:useBean id ="a" class="com.practice1.addition"></jsp:useBean>

<%= "Addition is "+a.add(4,6) %>
<br>
<%= "Multiply is "+a.mul(43,6) %>
<br>
<%= "Subtract is "+a.sub(54,6) %>
<br>
<%= "Division is "+a.div(43,6) %>

<jsp:include page="index.jsp"></jsp:include>

<%-- <jsp:forward page="index.jsp"></jsp:forward> --%>

</body>
</html>