<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><c:out value="${account.id}"/></title>
</head>
<body>
	<div id="head">
		<jsp:include page="/WEB-INF/header.jsp" /> <%--static include--%>
	</div>
	<div id="main">
	</div>

	<div id="footer">
		<jsp:include page="/WEB-INF/fotter.jsp" /> <%--static include--%>
	</div>
</body>
</html>