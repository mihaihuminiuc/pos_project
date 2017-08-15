<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Log in with your account</title>

  <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
  <%--<link href="${contextPath}/resources/css/common.css" rel="stylesheet">--%>
  <link href="${contextPath}/resources/css/app.css" rel="stylesheet">


  <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
  <script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</head>

<body>

<header class="header">
  <nav class="col-md-9 col-xs-9">
    <ul>
      <a href=""><li>Home</li></a>
      <a href=""><li>Page1</li></a>
      <a href=""><li>Page2</li></a>
      <a href=""><li>Page3</li></a>
    </ul>

  </nav>
  <div class="col-md-3 col-xs-3 loginButtons">
    <a href="${contextPath}/registration"><button>Sign in</button></a>


    <c:if test="${pageContext.request.userPrincipal.name != null}">
      <form id="logoutForm" method="POST" action="${contextPath}/logout">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
      </form>
        <a href="${contextPath}/login.jsp"><button>Log out</button></a>
      </c:if>
  </div>
</header>