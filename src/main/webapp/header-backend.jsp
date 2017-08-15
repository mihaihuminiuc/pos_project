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


<div class="col-md-12" style="padding: 0">
  <div class="col-md-2 col-xs-2 menuBackend">
    <ul class="">
      <a href="#"><li>Home</li></a>
      <a href="#" id="pages"><li>Pages</li>
        <ul style="display: none">
          <li>All pages</li>
          <li>Add new page</li>
        </ul>
      </a>
      <a href="#"><li>Posts</li></a>
      <ul style="display: none">
        <li>All posts</li>
        <li>Add new post</li>
      </ul>
      <a href="#"><li>Users</li></a>
      <a href="#"><li>Comments</li></a>
    </ul>
  </div>
