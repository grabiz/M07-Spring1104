<%-- 
    Document   : registerForm
    Created on : Apr 8, 2017, 8:21:31 PM
    Author     : iviettech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring MVC</title>
    </head>
    <body>
        <h1>Register User!</h1>
        <table>
            <form:form action="result" modelAttribute="user">
                <tr>
                    <td><form:label path="name">Name</form:label></td>
                    <td><form:input path="name"/></td>
                </tr>
                <tr>
                    <td><form:label path="lastName">Last Name</form:label></td>
                    <td><form:input path="lastName"/></td>
                </tr>
                <tr>
                    <td><form:label path="password">Password</form:label></td>
                    <td><form:password path="password"/></td
                </tr>
                <tr>
                    <td><form:label path="detail">Detail</form:label></td>
                    <td><form:textarea path="detail"/></td>
                </tr>
                <tr>
                    <td><form:label path="birthday">Birth Day</form:label></td>
                    <td><form:input path="birthday"/></td>
                </tr>
                <tr>
                    <td><form:label path="gender">Gender</form:label></td>
                    <td><form:radiobuttons path="gender" items="${gender}"/></td>
                </tr>
                <tr>
                    <td><form:label path="country">Country</form:label></td>
                    <td><form:select path="country" items="${countries}"/></td>
                </tr>
                <tr>
                    <td><form:label path="nonSmoking">Non Smoking</form:label></td>
                    <td><form:checkbox path="nonSmoking"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Register"></td>
                </tr>
            </form:form>
        </table>
    </body>
</html>
