<%--
  Created by IntelliJ IDEA.
  User: Аделя
  Date: 20.11.2018
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
  <form class="form-container" method="get" action="/">
    <div class="form-title"><h2>Sign up</h2></div>
    <div class="form-title">Name</div>
    <input class="form-field" type="text" name="firstname" /><br />
    <div class="form-title">Email</div>
    <input class="form-field" type="text" name="email" /><br />
    <div class="submit-container">
      <input class="submit-button" type="submit" value="Submit" />
    </div>
  </form>
<%--<c:if test="${not empty emailValue}">--%>
  <%--value=${emailValue}--%>
<%--</c:if>>--%>
  </body>
</html>
