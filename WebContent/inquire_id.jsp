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
<jsp:include page="2studetailinfo.html" flush="true"/>
<div class="information">

    <c:forEach var="Id"  items="${Stu_Id_List}">
    <tr>
    <td>${Id}</td>
    </tr>
    </c:forEach>
</div>
</body>
</html>