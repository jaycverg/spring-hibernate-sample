<%-- 
    Document   : master.tag
    Created on : Jan 26, 2013, 9:59:23 PM
    Author     : jaycverg <jaycverg@gmail.com>
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<%@attribute name="title"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctxPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>
            Service Request<c:if test="${not empty title}"> - ${title}</c:if>
            </title>
            <link href="${ctxPath}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
        <link href="${ctxPath}/resources/css/common.css" rel="stylesheet"/>
        <link href="${ctxPath}/resources/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet"/>

        <script src="${ctxPath}/resources/js/jquery-1.8.3.js"></script>
        <script src="${ctxPath}/resources/bootstrap/js/bootstrap.min.js"></script>
    </head>

    <body>
        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container">
                    <a href="${ctxPath}" class="brand">Employee Management</a>
                    <ul class="nav">
                        <li>
                            <a href="#">
                                <i class="icon-wrench icon-white"></i> Control Panel
                            </a>
                        </li>
                        <li><a href="#">Personalization</a></li>
                        <li><a href="#">Other Options</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="container">
            <jsp:doBody/>
        </div>
        <div class="container">
            &copy; 2013
        </div>
    </body>
</html>