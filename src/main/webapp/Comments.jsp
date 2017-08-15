<%@ include file="header-backend.jsp" %>

<div class="col-md-12" style="padding: 0">
    <div class="col-md-2 col-xs-2 menuBackend">
        <ul class="">
            <a href="#"><li>Home</li></a>
            <a href="#" id="pages"><li>Pages</li>
                <ul style="display: none">
                    <li>All pages</li>
                    <li>Add new page</li>
                </ul>
            </a>
            <a href="#"><li>Posts</li></a>
            <ul style="display: none">
                <li>All posts</li>
                <li>Add new post</li>
            </ul>
            <a href="#"><li>Users</li></a>
            <a href="#"><li>Comments</li></a>
        </ul>
    </div>
    <div class="col-md-10 col-xs-10">
        <div class="container-fluid">
            <h1>All Comments</h1>

            <table class = "table-fill">
                <thead>
                <tr>
                    <th>Author</th>
                    <th>Post</th>
                    <th>Comments</th>
                    <th>Date</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>mihai</td>
                    <td>Page1</td>
                    <td>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin vulputate placerat nibh, ac sagittis ante placerat ut. Praesent id quam ultricies, dictum augue non, ullamcorper ipsum. Praesent egestas cursus lectus in congue. Nam nec lobortis nibh, a ornare felis. Nam facilisis urna vitae nulla imperdiet euismod.</td>
                    <td>humi@gmail.com</td>
                </tr>
                <tr>
                    <td>xel</td>
                    <td>Page1</td>
                    <td>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin vulputate placerat nibh, ac sagittis ante placerat ut. Praesent id quam ultricies, dictum augue non, ullamcorper ipsum. Praesent egestas cursus lectus in congue. Nam nec lobortis nibh, a ornare felis. Nam facilisis urna vitae nulla imperdiet euismod.</td>
                    <td>anghelus.alexandra@gmail.com</td>
                </tr><tr>
                    <td>anca</td>
                    <td>Page1</td>
                    <td>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin vulputate placerat nibh, ac sagittis ante placerat ut. Praesent id quam ultricies, dictum augue non, ullamcorper ipsum. Praesent egestas cursus lectus in congue. Nam nec lobortis nibh, a ornare felis. Nam facilisis urna vitae nulla imperdiet euismod.</td>
                    <td>anastasiei.anca@gmail.com</td>
                </tr>
                </tbody>

            </table>
        </div>
    </div>
</div>

<%@ include file="footer.jsp" %>
