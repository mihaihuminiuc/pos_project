<%@ include file="header.jsp"%>



<div class="container">
  <h2 class="form-heading">User Account:</h2>
    <form:form method="POST" modelAttribute="userForm" action="${contextPath}/userdata"  id ="addUsers"  class="form-signin">

    <div class="col-md-6 ${error != null ? 'has-error' : ''}">
      <span>${message}</span>


      <label for = "userName">User Name</label>
      <!-- must be implemented username -->
      <input id = "userName" type = "text" class="form-control"  autofocus="true"

             <c:if test="${empty userDataForm.firstName}">
               placeholder=${"User Name"}
              </c:if>
              <c:if test="${not empty userDataForm.firstName}">
                placeholder=${userDataForm.firstName}
              </c:if>

              /><br/>

      <label for = "firstName">First Name</label>
      <input name="firstName" id="firstName" type="text" class="form-control"  autofocus="true"

              <c:if test="${empty userDataForm.firstName}">
                placeholder=${"First Name"}
              </c:if>
              <c:if test="${not empty userDataForm.firstName}">
                placeholder=${userDataForm.firstName}
              </c:if>

              /><br/>

      <label for = "lastName">Last Name</label>
      <input name="lastName" id="lastName" type="text" class="form-control"

              <c:if test="${empty userDataForm.firstName}">
                placeholder=${"Last Name"}
              </c:if>
              <c:if test="${not empty userDataForm.firstName}">
                placeholder=${userDataForm.lastName}
              </c:if>

              /><br/>
    </div>
    <div class="col-md-6">
      <label for = "email">Email</label>
      <input name="email" id="email" type="text" class="form-control"

              <c:if test="${empty userDataForm.email}">
                placeholder=${"Email"}
              </c:if>
              <c:if test="${not empty userDataForm.email}">
                placeholder=${userDataForm.email}
              </c:if>

              /><br/>

      <label for = "description">Description</label>
      <input name="description" id="description" type="text" class="form-control"

              <c:if test="${empty userDataForm.description}">
                placeholder=${"Desciption"}
              </c:if>
              <c:if test="${not empty userDataForm.description}">
                placeholder=${userDataForm.description}
              </c:if>

              /><br/>

      <label for = "picture">Picture</label>
      <input name="picture" id="picture" type="text" class="form-control"

              <c:if test="${empty userDataForm.picture}">
                placeholder=${"Picture link"}
              </c:if>
              <c:if test="${not empty userDataForm.picture}">
                placeholder=${userDataForm.picture}
              </c:if>

              /><br/>
      <span>${error}</span>
      <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

     </div>
    <div class="col-md-12">
      <button class="btn btn-lg btn-primary btn-block " id="signIn" type="submit">Submit</button>
    </div>
    <%--<h4 class="text-center"><a href="${contextPath}/userdata">Go to main page</a></h4>--%>
    </form:form>

</div>

<%@include file="footer.jsp"%>
