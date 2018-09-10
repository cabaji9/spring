<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<div>contactus</div>


<sf:form method="post"  modelAttribute="contact">
    <fieldset>
        <table>
            <tr>
                <td>Nombre:</td>
                <td><sf:input path="name" id="name"></sf:input>
                <sf:errors path="name" cssClass="error" />
                </td>
            </tr>
            <tr>
                <td>Phone:</td>
                <td><sf:input path="phone" id="phone"></sf:input>
                    <sf:errors path="phone" cssClass="error" />
                </td>
            </tr>

            <tr>
                <td>Accept:</td>
                <td><input type="submit" value="I accept"/></td>
            </tr>

        </table>


    </fieldset>


</sf:form>