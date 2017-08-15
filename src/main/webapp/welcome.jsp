<%@ include file="header.jsp" %>

<%!
    String userName;
%>

<div class="container">

    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
        <h2>Welcome ${pageContext.request.userPrincipal.name}</h2>
        <a onclick="document.forms['logoutForm'].submit()">Logout</a>
        <h4 class="text-center"><a href="${contextPath}/userdata">Go to user data page</a></h4>


    </c:if>

</div>
<%@ include file="footer.jsp" %>
