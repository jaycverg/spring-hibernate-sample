<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="layout" tagdir="/WEB-INF/tags/layout" %>

<c:set var="ctxPath" value="${pageContext.request.contextPath}"/>

<layout:master title="Request Details">

    <form:form id="req-form" class="form"
               modelAttribute="entity"
               method="POST">

        <legend>
            Employee Information
        </legend>
        <div>
            <form:label path="firstName">First Name <span class="required">*</span></form:label>
            <form:input path="firstName"/>
            <form:errors path="firstName" element="span" cssClass="alert alert-error"/>

            <form:label path="lastName">Last Name <span class="required">*</span></form:label>
            <form:input path="lastName"/>
            <form:errors path="lastName" element="span" cssClass="alert alert-error"/>

            <form:label path="middleName">Middle Name</form:label>
            <form:input path="middleName"/>
            <form:errors path="middleName" element="span" cssClass="alert alert-error"/>

            <form:label path="address">Address <span class="required">*</span></form:label>
            <form:input path="address" cssClass="width400"/>
            <form:errors path="address" element="span" cssClass="alert alert-error"/>

            <form:label path="birthDate">Birth Date (MM/dd/yyyy)</form:label>
            <form:input path="birthDate"/>
            <form:errors path="birthDate" element="span" cssClass="alert alert-error"/>

            <form:hidden path="id"/>
            <form:hidden path="version"/>

            <div>
                <button type="submit" class="btn btn-primary">Save</button>
                <button type="reset" class="btn">Reset</button>
            </div>
        </div>
    </form:form>

</layout:master>