<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details of Student</title>
</head>

<body>
<h1>Student Details</h1>
        <table width="400px" border="1">
            <tr>
                <th>No</th>
                <th>Student Name</th>
                <th>IC Number</th>
                <th>Matrix ID</th>
                <th>Contact Number</th>
                <th>Email</th>
                <th>Course</th>
                
                <th colspan="2">Action</th>
            </tr>
            <c:forEach var="sbean" items="${list}">
             <tr>
             
                 <td><c:out value="${sbean.id}" /></td>
                 <td><c:out value="${sbean.studName}" /></td>
                 <td><c:out value="${sbean.icNum}" /></td>
                 <td><c:out value="${sbean.matrixID}" /></td>
                 <td><c:out value="${sbean.contactNum}" /></td>
                 <td><c:out value="${sbean.email}" /></td>
                 <td><c:out value="${sbean.course}" /></td>
                 
                 
                 <td><a href="EditDeleteServlet?command=edit&sid=<c:out value='${sbean.id}' />">EDIT</a></td>
                 <td><a href="EditDeleteServlet?command=delete&sid=<c:out value='${sbean.id}' />">DELETE</a></td>
             </tr>
             </c:forEach>               
   </table>
   
   <table>
   <tr>
   <td><a href="EditDeleteServlet?command=home">Admin</a></td>
        </tr></table>

</body>
</html>
