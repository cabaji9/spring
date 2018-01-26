<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hyun Woo Son
  Date: 1/23/18
  Time: 9:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

LOOK FOR THIS OTHER PAGE

<div>${otherList}</div>

<c:forEach var="other" items="${otherList}">
   <span>${other}</span>
</c:forEach>


</body>
</html>
