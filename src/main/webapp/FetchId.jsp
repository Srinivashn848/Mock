<%@page import="dto.Details"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Details s =(Details)request.getAttribute("s"); %>
<table border="1">
					<tr>
					<th>Employee_id</th>
					<th>Name</th>
					<th>Mobile_Number</th>
					<th>Delete</th>
					<th>Edit</th>
					</tr>
						
					<tr>
					
						<th><%=s.getId()%></th>
						<th><%=s.getName()%></th>
						<th><%=s.getMobile_Number()%></th>
						<th><button>Delete</button></th>
						<th><button>Edit</button></th>
						</tr>
						
						</table>
</body>
</html>