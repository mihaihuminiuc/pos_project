<%@ include file="header.jsp" %>

<div class =" container" >
    <form action = "POST" id ="addUsers"  >
        <div class="col-md-6">
            <label for = "userName">User Name</label>
            <input id = "userName" type = "text" /><br/>

            <label for = "firstName">First Name</label>
             <input id = "firstName" type = "text" /><br/>

             <label for = "lastName">Last Name</label>
             <input id = "lastName" type = "text" /><br/>

             <label for = "email">Email</label>
             <input id = "email" type = "email" /><br/>


        </div>
        <div class="col-md-6">
            <label for = "password">Password</label>
            <input id = "password" type = "password" /><br/>
             <label for = "retypePassword">Retype Password</label>
             <input id = "retypePassword" type = "password" /><br/>

             <label for = "description">Description</label>
             <input id = "description" type = "text" /><br/>

             <label for = "picture">Picture</label>
             <input id = "picture" type = "file" /><br/>


        </div>
        <div class="col-md-12">
            <input type = "submit" value="Sign in" id = "signIn" />
        </div>
    </form>
</div>

<%@ include file="footer.jsp" %>
