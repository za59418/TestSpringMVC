<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>hello!! ${username}!!${users.size()}!!</h1>
    
	<table border="1">
		<c:forEach var="item" items="${users}" varStatus="status">
			<tr>
		         <td>${item.username}</td> 
		         <td>${item.password}</td> 
		         <td>${item.userSex}</td> 
			</tr>
		</c:forEach> 
	</table>
			
</body>
</html>