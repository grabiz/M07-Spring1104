<%-- 
    Document   : userResult
    Created on : Apr 8, 2017, 8:49:04 PM
    Author     : iviettech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Register Result</h1>
        <table>
            <tr>
                <td>Name: </td>
                <td>${user.name}</td>
            </tr>
            <tr>
                <td>Last Name: </td>
                <td>${user.lastName}</td>
            </tr>
            <tr>
                <td>Password: </td>
                <td>${user.password}</td>
            </tr>
            <tr>
                <td>Detail: </td>
                <td>${user.detail}</td>
            </tr>
            <tr>
                <td>Birth Day: </td>
                <td>${user.birthday}</td>
            </tr>
            <tr>
                <td>Gender: </td>
                <td>${user.gender}</td>
            </tr>
            <tr>
                <td>Country: </td>
                <td>${user.country}</td>
            </tr>
            <tr>
                <td>Non smoking: </td>
                <td>${user.nonSmoking}</td>
            </tr>
        </table>
    </body>
</html>
