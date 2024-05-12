<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Error Page</title>
</head>
<body>
    <h1>Error Page</h1>
    <p><spring:message code="error.required"/></p>
    <a href="home"><spring:message code="button.cancel"/></a>
</body>
</html>
