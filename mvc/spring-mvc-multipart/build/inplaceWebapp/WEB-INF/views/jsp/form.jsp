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

    <form method="post" enctype="multipart/form-data">
        <div style="display: flex; flex-direction: column">

            <div>
                first name : <input type="text" name="firstName" />

            </div>
            <div>
                last name : <input type="text" name="lastName" />
            </div>

            <div>
               File : <input type="file" name="picture" accept="image/jpeg,image/png" />
            </div>

        </div>



        <input type="submit" value="Register"/>

    </form>


</body>
</html>
