<%--
  Created by IntelliJ IDEA.
  User: konkon
  Date: 9/20/19
  Time: 3:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
<h2>Simple Calculator</h2>
<form action="/calculate" method="post">
    <div>
        <label>
            <input type="text" name="a1" value="${requestScope["a1"]}">
        </label>
        <label>
            <input type="text" name="a2" value="${requestScope["a2"]}">
        </label>
        <br>
        <input type="submit" name="operator" value="Addition(+)">
        <input type="submit" name="operator" value="Subtraction(-)">
        <input type="submit" name="operator" value="Multiplication(*)">
        <input type="submit" name="operator" value="Division(/)" >
        <br>
        <p>Result: ${requestScope["result"]}</p>
    </div>
</form>
</body>
</html>
