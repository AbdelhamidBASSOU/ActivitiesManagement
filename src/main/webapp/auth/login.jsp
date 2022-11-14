<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 03/11/2022
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>

<%@ include file="../shared/header.jsp"%>



<section class="d-flex justify-content-md-center pt-5 vh-100">
    <form method="post" class="form w-50  h-50 mt-5 border p-5" name="login">
        <div class="form-group">
            <span class="text-danger">
                <%
                    if (request.getAttribute ( "errorMessage" ) != null){
                        out.println ( request.getAttribute ( "errorMessage" ) );
                    }
                %>
            </span>
        </div>
        <div class="form-group">
            <label for="username" class="form-label">Username</label>
            <input type="text" name="username" id="username" class="form-control" placeholder="Enter your username" required>
        </div>
        <div class="form-group">
            <label for="password" class="form-label">Password</label>
            <input type="password" name="password" id="password" class="form-control" placeholder="Enter your password" required>
        </div>
        <div class="form-group">
            <a href="register" class="link-muted">register</a>
        </div>
        <div class="form-group mt-4">
            <input type="submit" value="Login" class="form-control bg-primary text-white">
        </div>
    </form>
</section>


<!--
    <form name="login" method="post">
        <label>username</label>
        <input type="text" name="username" id="username" placeholder="Username">
        <br>
        <label>Password:</label>
        <input type="password" name="password" placeholder="Password">
        <br>
        <input type="submit" value="Sign In">
    </form>
-->


<%@ include file="../shared/footer.jsp"%>