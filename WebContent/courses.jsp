<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查询结果</title>
<link rel="stylesheet" href="0mainpage.css" /> 
</head>
<body>
<jsp:include page="3StuGradeInfo.html" flush="true"/>
<div class="information">
<table>
    <c:forEach var="Student_Info"  items="${Stu_List}">
    <tr>
    <td>${Student_Info}</td>
    </tr>
    </c:forEach>
</table>
</div>
</body>
</html>