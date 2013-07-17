<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags/layout" %>

<c:set var="ctxPath" value="${pageContext.request.contextPath}"/>

<layout:master title="Employee List">

    <legend>Service Requests</legend>
    <div class="pull-left">
        <a href="${ctxPath}/employee/create" class="btn btn-primary">
            <i class="icon-white icon-plus"></i> Add New Employee
        </a>
    </div>
    <div class="form-search pull-right">
        <form class="input-append">
            <input type="search"
                   name="searchText"
                   value="${param.searchText}"
                   placeholder="Search"
                   class="input-large"
                   style="width:300px"/>
            <button class="btn" title="Search">
                <i class="icon-search"></i>
            </button>
        </form>
    </div>
    <div class="clearfix"></div>
    <br/>
    <table class="table table-bordered table-hover">
        <tr>
            <th>ID</th>
            <th>Last Name</th>
            <th>First Name</th>
            <th>Middle Name</th>
            <th>Address</th>
            <th></th>
        </tr>
        <c:if test="${empty list}">
            <tr>
                <td colspan="7">
                    <i>No records</i>
                </td>
            </tr>
        </c:if>
        <c:forEach items="${list}" var="item">
            <tr>
                <td class="a-right">${item.id}</td>
                <td>${item.firstName}</td>
                <td>${item.lastName}</td>
                <td>${item.middleName}</td>
                <td>${item.address}</td>
                <td class="a-center">
                    <a href="${ctxPath}/employee/${item.id}">View</a>
                    <span> | </span>
                    <a href="${ctxPath}/employee/remove/${item.id}"
                       onclick="return confirm('Are you sure you want to delete this entry?');">
                        Delete
                    </a>
                </td>
            </tr>
        </c:forEach>
    </table>

</layout:master>