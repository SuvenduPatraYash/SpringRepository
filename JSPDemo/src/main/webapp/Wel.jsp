<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multiplication Table</title>
</head>
<body>
<% 
String n = request.getParameter("number");
if(!(n == null || (n.equals(""))))
{
int num = Integer.parseInt(n);
%>
<p>Multiplication Table of <%=num %> is : </p>
<%
for(int i = 1; i <= 10; i++)
{
%>
<table>
<tr>
<td><%=num %> x <%=i %> = <%=num*i %></td>
</tr>
</table>
<%
}
}
%>
</body>
</html>