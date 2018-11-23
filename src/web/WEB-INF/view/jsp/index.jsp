
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
      <title>Registration</title>
      <%--<link rel="stylesheet" href="<c:url value="/css/new_form.css"/>">--%>
  </head>
  <body background="/resources/fon.jpg">
    <form class="form-container" action="/result" method="post">
      <input type="text" required
      name="name">

      <%--<div class="form-title">--%>
          <%--<h2>Sign up</h2>--%>
      <%--</div>--%>
      <%--<div class="form-title">Email</div>--%>
        <%--<input class="form-field"--%>
             <%--type="text"--%>
             <%--name="email" required--%>
      <%--<c:if test="${not empty emailValue}">--%>
             <%--value=${emailValue}--%>
      <%--</c:if>>--%>

      <%--<c:if test="${not empty email_error}">--%>
          <%--<small>${email_error}</small>--%>
      <%--</c:if><br />--%>
      <%--<div class="form-title">Password</div>--%>
      <%--<input class="form-field"--%>
             <%--type="password"--%>
             <%--name="password1" required--%>
      <%--<c:if test="${not empty pass_error}">--%>
          <%--<small>${pass_error}</small>--%>
      <%--</c:if><br />--%>
      <%--<div class="form-title">Repeat password</div>--%>
      <%--<input class="form-field"--%>
             <%--type="password"--%>
             <%--name="password2" required >--%>
      <%--<c:if test="${not empty equals_error}">--%>
          <%--<small>${equals_error}</small>--%>
      <%--</c:if>--%>
      <%--<div class="form-title">Country</div>--%>
      <%--<input id="reg_country" class="form-field"--%>
             <%--type="text"--%>
             <%--name="country"--%>
             <%--placeholder="Country" required--%>
      <%--<c:if test="${not empty countryValue}">--%>
             <%--value=${countryValue}--%>
      <%--</c:if>>--%>
      <%--<div class="form-title">Sex</div>--%>
      <%--<input type="radio"--%>
             <%--name="sex"--%>
             <%--value="male"--%>
      <%--<c:if test="${sex == 'male'}">--%>
             <%--checked="checked"--%>
      <%--</c:if>> М--%>
      <%--<input type="radio"--%>
             <%--name="sex"--%>
             <%--value="female"--%>
      <%--<c:if test="${sex == 'female'}">--%>
             <%--checked="checked"--%>
      <%--</c:if>> Ж <br />--%>
      <%--<div class="form-title">Birthday</div>--%>
      <%--<input class="form-field"--%>
             <%--type="date"--%>
             <%--name="dateOfBirth" required--%>
      <%--<c:if test="${not empty birthValue}">--%>
             <%--value=${birthValue}--%>
      <%--</c:if>>--%>

      <%--<c:if test="${not empty date_error}">--%>
          <%--<small>${date_error}</small>--%>
      <%--</c:if><br />--%>
      <%--<div class="form-title">--%>
          <%--<input--%>
                  <%--type="checkbox"--%>
                  <%--name="FollowNews"--%>
                  <%--<c:if test="${follow == 'on'}"> checked ="checked" </c:if>/> Follow the news--%>
      <%--</div>--%>
      <%--<div class="form-title">--%>
          <%--<input--%>
                  <%--type="checkbox"--%>
                  <%--name="check2" required/>--%>
          <%--I'm agree with privacy policy--%>
      <%--</div>--%>
      <%--<div class="submit-container">--%>
          <%--<input class="submit-button" type="submit" value="Submit" />--%>
      <%--</div>--%>
    </form>
  </body>
</html>
  </body>
</html>
