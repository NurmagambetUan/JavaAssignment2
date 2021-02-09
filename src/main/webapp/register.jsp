<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-8">
            <h1 class="mt-5">Register Here</h1>
            <form action="register" class="form-group" method="post">
                <%--@declare id="email"--%><%--@declare id="password"--%>
                <%--@declare id="uname"--%>
                <%--@declare id="password1"--%><%--@declare id="password2"--%>
                <label class="form-label mt-3" for="uname">Enter Your UserName</label>
                <input type="text" class="form-control">
                 <label class="form-label mt-3" for="email">Enter Your Email</label>
                <input type="email" class="form-control">
                <label for="password1"  class="form-label mt-3" >Enter Your Password</label>
                <input type="password" class="form-control">
                <label for="password2"  class="form-label mt-3" >Confirm Your Password</label>
                <input type="password" class="form-control">
                <button type="submit" class="btn btn-primary mt-4 ">Register</button>
            </form>
        </div>
    </div>
</div>
</body>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</html>
