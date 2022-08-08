<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Current visit count</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col text-center my-5">
				<h2>You have visited <a href="http://localhost:8080/">http://localhost:8080/</a> <c:out value="${counter }" /> times.</h2>
				<a href="http://localhost:8080/">Test another visit?</a>
				<br>
				<a class="btn btn-lg btn-danger" href="/reset">Reset Count</a>
			</div>
		</div>
	</div>
</body>
</html>