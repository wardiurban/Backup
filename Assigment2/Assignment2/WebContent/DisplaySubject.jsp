<%@page import="com.bean.Subject"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1">
	<tr>
		<th>Subject ID</th>
		<th>SubjectID Name</th>
		<th>Class</th>
		<th>Teacher</th>
		
	</tr>
<%
Object obj =request.getAttribute("obj");
List<Subject> listOfSu = (List<Subject>)obj;
Iterator<Subject> li = listOfSu.iterator();

while(li.hasNext()){
  Subject s  = li.next();
  %>
	<tr>
		<td><%=s.getSid() %> </td>
		<td><%=s.getSname() %> </td>
		<td><%=s.getScid() %> </td>
		<td><%=s.getStid() %> </td>
	</tr>
  <%
}
%>
</table>
</body>
</html>