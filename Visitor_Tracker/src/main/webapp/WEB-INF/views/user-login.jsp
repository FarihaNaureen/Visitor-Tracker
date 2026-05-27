<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>

<link rel="stylesheet"
href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"/>

<style>

body{
background: radial-gradient(circle at top left,
#4e54c8 0%,
#0b3b82 40%,
#081d40 100%);

min-height:100vh;
display:flex;
justify-content:center;
align-items:center;
color:white;
}

.login-shell{
width:100%;
max-width:460px;
padding:2rem;
border-radius:1.5rem;
background:rgba(255,255,255,0.08);
border:1px solid rgba(255,255,255,0.18);
backdrop-filter:blur(12px);
box-shadow:0 30px 80px rgba(0,0,0,0.25);
}

.form-control{
background:rgba(255,255,255,0.12);
color:white;
}

.btn-login{
background:linear-gradient(
135deg,
#6a82fb,
#fc5c7d);
border:none;
}

a{
color:#dce5ff;
}

</style>

</head>

<body>

<div class="login-shell">

<h3 class="text-center">
User Login
</h3>

<form action="${pageContext.request.contextPath}/user/login"
method="post">

<div class="form-group">

<label>Username</label>

<input
type="text"
name="username"
class="form-control"
required>

</div>

<div class="form-group">

<label>Password</label>

<input
type="password"
name="password"
class="form-control"
required>

</div>

<button
type="submit"
class="btn btn-login btn-block">

Login

</button>

</form>

<div class="text-center mt-3">

Don't have an account?

<a href="${pageContext.request.contextPath}/user/register">

Register here

</a>

</div>

</div>

</body>
</html>