<%@page import="dto.Details"%>
<%@page import="dao.Detailsdao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% int id=Integer.parseInt(request.getParameter("id")); 
Detailsdao sao= new Detailsdao();
Details s=sao.find(id);
%>

<form action="update" method=post>
        <table >
        <tr>
                <th>Employee_id:</th>
                <td>
                    <input type="text" name="id" id="id" value="<%=id %>" readonly="readonly">
                </td>
            </tr>
            <tr>
                <th>Name:</th>
                <td>
                    <input type="text" name="name" id="name" value="<%=s.getName() %>">
                </td>
            </tr>
            <tr>
        <th>
            Mobile_Number:
        </th>
        <td>
            <input type="tel" name="mobile" pattern={0-9}[10] value="<%=s.getMobile_Number() %>">
        </td>
    </tr>
    </table>
    <button type="Update">Update</button>
            <button type="submit">Cancel</button>
            
    </form>
<a href="Home.html"><button> Home</button></a>
</body>
</html>