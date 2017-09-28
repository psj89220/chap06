<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sitemesh" tagdir="/WEB-INF/tags/sitemesh" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><sitemesh:write property="title"/></title>
<link rel="stylesheet" href="/webjars/bootstrap/3.3.7/css/bootstrap.css" />
<link rel="stylesheet" href="/webjars/bootstrap/3.3.7/css/bootstrap-theme.css" />
<link rel="stylesheet" href="/webjars/animate.css/3.5.2/animate.css" />

<script type="text/javascript" src="/webjars/bootstrap/3.3.7/js/bootstrap.js"></script>
<script type="text/javascript" src="/webjars/jquery/1.11.1/jquery.js"></script>
<script type="text/javascript" src="/webjars/chartjs/2.6.0/Chart.bundle.js"></script>
<sitemesh:write property="head"/>

<c:if test="${false}">
<link rel="stylesheet" href="../static/css/bootstrap.css" />
<link rel="stylesheet" href="../static/css/animate.css" />
</c:if>

</head>
<body class="container">

<div class="page-header animated fadeInRight ">
	<h1>
		### Boot06 Project <small>for Spring MVC + JPA</small>
	</h1>
</div>

<div class="panel panel-default">
<!-- 	<div class="panel-body">Web Board List Page</div> -->
	<sitemesh:write property="body"/>
</div>

</body>
</html>