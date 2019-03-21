<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Students Details</title>
 
<style type="text/css">
    body{
        text-align: center;
    }
    table {
        margin-left: 15%;
        min-width: 70%;
        border: 1px solid #CCC;
        border-collapse: collapse;
    }
    table tr{line-height: 30px;}
    table tr th { background: #000033; color: #FFF;}
    table tr td { border:1px solid #CCC; margin: 5px;}
    input[type=text], input[type=email], input[type=tel]{
        min-width: 60%;
    }
    input[type=submit], a{
        background: green;
        padding: 5px;
        margin: 5px;
        color: #FFF;
    }
    a{
        text-decoration: none;
    }
</style>
</head>
<body>

    <h1>List of Customers</h1>
    <table>
        <tr>
            <th>No</th>
                <th>Student Name</th>
                <th>IC Number</th>
                <th>Matrix ID</th>
                <th>Contact Number</th>
                <th>Email</th>
                <th>Course</th>
        </tr>
        <c:forEach items="pelajarList" var="pelajar">
            <tr>
                <td><c:out value="${pelajarList.No}" ></c:out></td>
                <td><c:out value="${pelajarList.studName}" ></c:out></td>
                <td><c:out value="${pelajarList.icNum}" ></c:out></td>
                <td><c:out value="${pelajarList.matrixID}" ></c:out></td>
                <td><c:out value="${pelajarList.contactNum}" ></c:out></td>
                <td><c:out value="${pelajarList.email}" ></c:out></td>
                <td><c:out value="${pelajarList.course}" ></c:out></td>
                 
                <td>
                    <form action="<c:url value="/pelajar/update"/>" method="post">
                        <input type="hidden" name="pelajarId" value="${'${'}pelajar.id}">
                        <input type="submit" value="Update">
                    </form>
                <td>
                    <form action="<c:url value="/pelajar/delete"/>" method="post">
                        <input type="hidden" name="pelajarId" value="${'${'}pelajar.id}">
                        <input style="background: #F00;" type="submit" value="Delete">
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>