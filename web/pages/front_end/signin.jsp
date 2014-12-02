<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Sign in - TeamWork</title>

    <!-- Bootstrap core CSS -->
    <link href="../../css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="../../css/teamwork.css" rel="stylesheet">
</head>

<body id="dummybodyid">
    <div class="container">
        <div class="header">
            <h1>TeamWork</h1>
        </div>
        <div class="main-container">
            <div class="banner">
                <img src="../../../../../Desktop/f1554da78021af51cef2d615ca2c2630.jpg" width="400">
            </div>
            <div class="loginbox">
                <form id="loginform" action method="post" class="auth-form form-horizontal">
                    <div class="inputbox">
                        <input type="text" placeholder="Username" id="username" required autofocus>
                    </div>
                    <div class="inputbox">
                        <input type="text" placeholder="Password" id="Password" required>
                    </div>
                    <button type="submit" class="btn btn-primary btn-large">Sign in</button>
                    <div class="action-wrapper clearfix">
                        <a href="/forgot" class="forget">Forgot Password？</a>
                        <a href="/signup" class="signup pull-right">Sign up</a>
                    </div>
                </form>
            </div>
        </div>
        <footer>
            <div class="container">
                <h1>Contact Us.</h1>
                <p>Email:test@gmail.com</p>
            </div>
            <div class="copyright">
                <div class="footer-logo">TeamWork</div>
                <p class="text">Copyright © 2013-2014 TeamWork.All Rights Reserved.</p>
            </div>
        </footer>  
    </div>
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <script src="../../js/bootstrap.min.js"></script>
    <script src="../../js/index.js"></script>
</body>
</html>
