<%--
  Created by IntelliJ IDEA.
  User: Hyun Woo Son
  Date: 6/25/18
  Time: 9:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Exception Page</h1>
<p>Application has encountered an error. Please contact support on ...</p>


    Failed URL: ${url}
    Exception:  ${exception.message}
        <c:forEach items="${exception.stackTrace}" var="ste">    ${ste}
    </c:forEach>


</body>
</html>
