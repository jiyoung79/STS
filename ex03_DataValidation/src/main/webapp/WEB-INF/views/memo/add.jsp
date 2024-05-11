<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1>memo/add page</h1>
	
	<form action="${pageContext.request.contextPath}/memo/add" method="post">
		<input name="id" placeholder="insert id" /> <br>
		<input name="memo" placeholder="insert memo" /> <br>
		<input name="writer" placeholder="insert writer" /> <br>
		<input name="datetime" placeholder="yyyy-MM-dd hh:mm:ss" /> <br>
		<button>SUBMIT</button>
	</form> 
</body>
</head>