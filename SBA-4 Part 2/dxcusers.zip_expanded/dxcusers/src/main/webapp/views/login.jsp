<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 550px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    

.btn-primary {
    background: #2c2c2c;
  }

  .btn-primary:hover{
    background: #54545c;
  }

  .btn-secondary:hover{
    background: #d1d1d1;
  }

    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;} 
    }
  </style>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">MY PROJECT</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li><a href="#">Home</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li class="active"><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>
  
<div class="container-fluid text-center">    
  <div class="row content">
    <div class="col-sm-2 sidenav">
    </div>
    <div class="col-sm-8 text-left"> 
      <center>
      <h2>LOGIN</h2>
      <p></p>


      <form action="loginValidation">
        <br>
        <div style="width: 50%">
          <input type="text" class="form-control" id="username" name="username" placeholder="Enter Username">
        </div>
        <br>
        <div style="width: 50%">
          <input type="password" class="form-control" id="password" name="password" placeholder="Enter Password">
        </div>
        <br>
        <div style="width: 50%">
        <input type="submit" class="btn btn-primary btn-block" name="login" value="Login" onclick="return custom()">
        </div>
      </form>
      <br>
      <form action="forgotPassword">
      <input type="submit" name="forgot" value="Forgot Password?" class="btn btn-link">
      </form>
      <hr>
      <input type="submit" class="btn btn-secondary" name="login" value="Create New Account">
      </center>
    </div>
    <div class="col-sm-2 sidenav">
    </div>
  </div>
</div>

<footer class="container-fluid text-center">
  <p>SBA 4 - Part 2 by AJITKUMAR</p>
</footer>

<script type="text/javascript">
  function checkusername(){
    if($('#username').val() == ''){
      return false;
    }
  }

  function checkpassword(){
    if($('#password').val() == ''){
      return false;
    }
  }

function custom(){
  var val = checkusername();
  if (val == false){alert('Username field cannot be empty');
    return false;
  }
  val = checkpassword();
  if (val == false){alert('Password field cannot be empty');
    return false;
  }
  else{
    return true;
  }

}

</script>



</body>
</html>
