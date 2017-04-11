<%-- 
    Document   : registerBootstrap
    Created on : Apr 11, 2017, 6:21:05 PM
    Author     : iviettech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="<c:url value='webjars/bootstrap/3.3.7/css/bootstrap.min.css'/>" type="text/css" />
        <link rel="stylesheet" href="<c:url value='Resources/css/style.css'/>" type="text/css" />
        <!-- Include Required Prerequisites -->
        <script type="text/javascript" src="//cdn.jsdelivr.net/jquery/1/jquery.min.js"></script>
        <script type="text/javascript" src="//cdn.jsdelivr.net/momentjs/latest/moment.min.js"></script>

        <!-- Include Date Range Picker -->
        <script type="text/javascript" src="//cdn.jsdelivr.net/bootstrap.daterangepicker/2/daterangepicker.js"></script>
        <link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/bootstrap.daterangepicker/2/daterangepicker.css" />
    </head>
    <body>

        <div class="container">
            <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-12 text-center">
                    <h1>Hello World!</h1>
                </div>
            </div>

            <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-12">
                    <mvc:form action="resultForm" method="post" modelAttribute="user" >
                        <div class="form-group">
                            <label for="name">Name </label>
                            <input type="text" name="name" class="form-control" id="name" placeholder="Name"/>
                        </div>
                        <div class="form-group">
                            <label for="lastname">Last Name </label>
                            <input type="text" name="lastName" class="form-control" id="lastname" placeholder="Last Name"/>
                        </div>
                        <div class="form-group">
                            <label for="password">Password </label>
                            <input type="password" name="password" class="form-control" id="password" placeholder="Password"/>
                        </div>
                        <div class="form-group">
                            <label for="detail">Detail </label>
                            <textarea rows="3" name="detail" class="form-control" id="detail"></textarea>
                        </div>
                        <div class="form-group">
                            <label for="birthday">Birth Date </label>
                            <input  type="text" name="daterange" value="01/01/2015 1:30 PM - 01/01/2015 2:00 PM" />
                        </div>
                        <div class="form-group">
                            <label class="radio-inline">
                                <input type="radio" name="gender" id="inlineRadio1" checked value="Male"> Male
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="gender" id="inlineRadio2" value="option2"> Female
                            </label>
                        </div>
                        <div class="form-group">
                            <label for="country">Country </label>
                            <select class="form-control" name="country">   <!--trung voi bien trong model -->
                                <c:forEach var="country" items="${countries}">
                                    <option value="${country}">${country}</option>
                                </c:forEach>

                            </select>
                        </div>
                        <div class="form-group">
                            <label class="checkbox-inline">
                                <input type="checkbox" name="nonSmoking"> Non Smoking
                            </label>
                        </div>
                        <div class="form-group text-center">
                            <button type="submit" class="btn btn-primary">Register</button>
                        </div>
                    </mvc:form>
                </div>
            </div>
        </div>
    </body>
</html>
<script type="text/javascript">
   $(function() {
    $('input[name="daterange"]').daterangepicker({
        timePicker: true,
        timePickerIncrement: 30,
        locale: {
            format: 'MM/DD/YYYY h:mm A'
        }
    });
});
</script>