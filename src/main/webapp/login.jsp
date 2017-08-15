<%@ include file="header.jsp" %>

<div class="container">

    <form:form method="POST" modelAttribute="userForm" action="${contextPath}/login" class="form-signin loginForm">
        <%--<h2 class="form-heading">Log in</h2>--%>

        <div class="form-group ${error != null ? 'has-error' : ''}">

            <span>${message}</span>
            <label for="userLogin">Username</label>
            <input name="username" id="userLogin" type="text" class="form-control" placeholder="Username"autofocus="true"/>

            <label for="passwordLogin">Password</label>
            <input name="password" type="password" id="passwordLogin" class="form-control" placeholder="Password"/>

            <span>${error}</span>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

            <button class="btn btn-lg btn-primary btn-block" id="loginButton" type="submit">Log In</button>

        </div>

    </form:form>

</div>
<!-- /container -->
    <%@ include file="footer.jsp" %>