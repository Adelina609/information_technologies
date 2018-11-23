<%--
  Created by IntelliJ IDEA.
  User: Аделя
  Date: 02.11.2018
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="<c:url value="../../css/container.css"/>">
</head>
<body background="/resources/img.jpg">
<form class="form-container" action="/signupresult" method="post">
    <div class="form-title">
        <h2>Sign up</h2>
    </div>
    <div class="form-title">Email</div>
    <input class="form-field"
            name="email" type="text"
            <c:if test="${not empty emailValue}">
                value=${emailValue}
            </c:if>/><br />
    <div class="form-title">Password</div>
    <input class="form-field"
           type="password" name="pass"
    <c:if test="${not empty pass_error}">
        <td class="Errors">${pass_error}</td>
    </c:if><br />
    <div class="submit-container">
        <input class="submit-button" type="submit" value="Submit" />
    </div>
</form>

</body>
</html>
