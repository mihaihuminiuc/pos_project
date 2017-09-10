<%@ include file="header.jsp" %>

<html>

<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css"/>
    <title th:text="#{label.pages.home.title}">Title</title>
    <script th:inline="javascript">
        /*<![CDATA[*/
        function validate() {
            if (document.f.username.value == "" && document.f.password.value == "") {
                alert(/*[[#{message.username} + #{message.password}]]*/);
                document.f.username.focus();
                return false;
            }
            if (document.f.username.value == "") {
                alert(/*[[#{message.username}]]*/);
                document.f.username.focus();
                return false;
            }
            if (document.f.password.value == "") {
                alert(/*[[#{message.password}]]*/);
                document.f.password.focus();
                return false;
            }
        }
        /*]]>*/
    </script>
    <style type="text/css">
        .wrapper{width:500px;margin-left:auto;margin-right:auto}
        label{padding-left:0 !important}
    </style>
</head>
<body>
<div th:if="${param.message != null}" class="alert alert-info" th:text="${param.message[0]}">message</div>


<div th:if="${param.error != null}" class="alert alert-danger" th:text="${session[SPRING_SECURITY_LAST_EXCEPTION]}">error</div>

<div class="container">
    <div class="row wrapper">
        <h1 th:text="#{label.form.loginTitle}">Header</h1>
        <a href="?lang=en" th:text="#{label.form.loginEnglish}">login</a> |
        <a href="?lang=es_ES" th:text="#{label.form.loginSpanish}">login</a>
        <br/><br/>

        <form name='f' action="login" method='POST' onsubmit="return validate();">

            <label class="col-sm-4" th:text="#{label.form.loginEmail}">Email</label>
            <span class="col-sm-8"><input class="form-control" type='text' name='username' value=''/></span>

            <br/><br/>
            <label class="col-sm-4" th:text="#{label.form.loginPass}">password</label>
            <span class="col-sm-8"><input class="form-control" type='password' name='password' /></span>

            <br/><br/>
            <label class="col-sm-4" th:text="#{label.form.login2fa}">Google Authenticator Verification Code</label>
            <span class="col-sm-8"><input class="form-control" type='text' name='code' /></span>

            <br/><br/>
            <input class="btn btn-primary" name="submit" type="submit" th:value="#{label.form.submit}" />

        </form>
        <br/> Current Locale :  <span th:text="${#locale}"></span><br/><br/>
        <a class="btn btn-default" th:href="@{/registration.html}" th:text="#{label.form.loginSignUp}">signup</a>
        <br/>
        <a class="btn btn-default" th:href="@{/registrationCaptcha.html}" th:text="#{label.form.loginSignUpCaptcha}">captcha signup</a>
        <br/><br/>
        <a class="btn btn-default" th:href="@{/forgetPassword.html}" th:text="#{message.resetPassword}">reset</a>
    </div>
</div>
</body>

</html>

<%@ include file="footer.jsp" %>