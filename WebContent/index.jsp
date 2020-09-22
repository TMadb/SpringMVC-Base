<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test</title>
</head>
<body>
  <a href="<c:url value="/my.do" />" target="_blank">Controller</a><br />
  <a href="<c:url value="/http.do" />" target="_blank">HttpRequestControllerHandler</a><br />
  <%-- <a href="<c:url value="/ab.do" />" target="_blank">AbstractControllerTest</a> --%>
  <form action="<c:url value="/ab.do" />" method="post">
    <input type="submit" value="AbstractController限定提交方法之post" />
  </form>
</body>
</html>