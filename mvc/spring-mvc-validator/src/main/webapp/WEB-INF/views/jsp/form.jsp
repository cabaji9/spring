<%--
  Created by IntelliJ IDEA.
  User: Hyun Woo Son
  Date: 6/13/18
  Time: 9:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>




    <form method="post">

        <div style="display:flex; flex-direction: column">
            <div> first name : <input type="text" name="firstName" /></div>
            <div> last name : <input type="text" name="lastName" /></div>
            <div> number : <input type="text" name="number" /></div>
            <div> phone : <input type="text" name="phone" /></div>
            <div> mail : <input type="text" name="mail" /></div>
            <div> birthday : <input type="date" name="birthday" /></div>


            <div >${dataError}</div>
        </div>





        <input type="submit" value="Register"/>

    </form>


</body>
</html>
