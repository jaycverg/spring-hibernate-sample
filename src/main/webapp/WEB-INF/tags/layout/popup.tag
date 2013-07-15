<%-- 
    Document   : popup.tag
    Created on : Jan 26, 2013, 10:16:13 PM
    Author     : jaycverg <jaycverg@gmail.com>
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="id"%>
<%@attribute name="title"%>
<%@attribute name="buttons" fragment="true"%>

<%-- any content can be specified here e.g.: --%>
<div id="${id}" 
     class="modal hide fade" 
     role="dialog"
     aria-labelledby="contact-info-title">

    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3 id="contact-info-title">${title}</h3>
    </div>

    <div class="overlayable">
        <div class="modal-body">
            <jsp:doBody/>
        </div>
        <div class="modal-footer">
            <jsp:invoke fragment="buttons"/>
            <c:if test="${empty buttons}">
                <button type="button" class="btn" data-dismiss="modal">
                    Close
                </button>
            </c:if>
        </div>
        <div class="overlay loading-overlay modal-backdrop">
            <div class="progress progress-striped active">
                <div class="bar" style="width: 100%;">Processing...</div>
            </div>
        </div>
    </div>
</div>