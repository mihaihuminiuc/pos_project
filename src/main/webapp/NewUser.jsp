<%@ include file="header-backend.jsp" %>

    <div class="col-md-10 col-xs-10">
        <div class="container-fluid">
            <h1>All Comments</h1>

            <form action = "POST" id ="addUsers"  >
                <table class = "table-fill">
                    <tbody>
                        <tr>
                            <td ><label for = "userName">User Name</label></td>
                            <td><input id = "userName" type = "text" /></td>
                        </tr>
                        <tr>
                            <td><label for = "firstName">First Name</label></td>
                            <td><input id = "firstName" type = "text" /></td>
                        </tr>
                        <tr>
                            <td><label for = "lastName">Last Name</label></td>
                            <td><input id = "lastName" type = "text" /></td>
                        </tr>
                        <tr>
                            <td><label for = "email">Email</label></td>
                            <td><input id = "email" type = "email" /></td>
                        </tr>


                        </tbody>
                </table><br/>
                <input type = "submit" value="Save" id = "save" />
            </form>
        </div>
    </div>
</div>

<%@ include file="footer.jsp" %>
