<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>Hello World !!</p>
        <c:forEach var="num" items="${list}">
            <c:if  test="${num % 2 == 0}">
                <p>${num}</p>
            </c:if>
        </c:forEach>
    </body>
</html>
