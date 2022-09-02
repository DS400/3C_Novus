<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<c:out value="jstl>>>"/>
<a href="hello-servlet">Hello Servlet</a>
<form action="hello-servlet" method="post">



    <input name="name">
    <button type="submit" value="BTN1" name="act">Click</button>
    <button type="submit" value="BTN2" name="act">Click1</button>
    <button type="submit" value="BTN3" name="act">Click2</button>
</form>
</body>
</html>