<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Admin Login</title>
<style>
body {
	background: #384047;
	font-family: sans-serif;
	font-size: 10px;
}

form {
	background: #fff;
	padding: 4em 4em 2em;
	max-width: 400px;
	margin: 50px auto 0;
	box-shadow: 0 0 1em #222;
	border-radius: 2px;
}

form h2 {
	margin: 0 0 50px 0;
	padding: 10px;
	text-align: center;
	font-size: 30px;
	color: #666666;
	border-bottom: solid 1px #e5e5e5;
}

form p {
	margin: 0 0 3em 0;
	position: relative;
}

form input {
	display: block;
	box-sizing: border-box;
	width: 100%;
	outline: none;
	margin: 0;
}

form input[type="text"], form input[type="password"] {
	background: #fff;
	border: 1px solid #dbdbdb;
	font-size: 1.6em;
	padding: .8em .5em;
	border-radius: 2px;
}

form input[type="text"]:focus, form input[type="password"]:focus {
	background: #fff;
}

form span {
	display: block;
	background: #F9A5A5;
	padding: 2px 5px;
	color: #666;
}

form input[type="submit"] {
	background: rgba(148, 186, 101, 0.7);
	box-shadow: 0 3px 0 0 rgba(123, 163, 73, 0.7);
	border-radius: 2px;
	border: none;
	color: #fff;
	cursor: pointer;
	display: block;
	font-size: 2em;
	line-height: 1.6em;
	margin: 2em 0 0;
	outline: none;
	padding: .8em 0;
	text-shadow: 0 1px #68B25B;
}

form input[type="submit"]:hover {
	background: #94af65;
	text-shadow: 0 1px 3px rgba(70, 93, 41, 0.7);
}

form label {
	position: absolute;
	left: 8px;
	top: 12px;
	color: #999;
	font-size: 16px;
	display: inline-block;
	padding: 4px 10px;
	font-weight: 400;
	background-color: rgba(255, 255, 255, 0);
	-moz-transition: color 0.3s, top 0.3s, background-color 0.8s;
	-o-transition: color 0.3s, top 0.3s, background-color 0.8s;
	-webkit-transition: color 0.3s, top 0.3s, background-color 0.8s;
	transition: color 0.3s, top 0.3s, background-color 0.8s;
}

form label.floatLabel {
	top: -11px;
	background-color: rgba(255, 255, 255, 0.8);
	font-size: 14px;
}
</style>
</head>
<body>
	<form action="loginservaletadmin" method="post">
		<h2>Log In</h2>

	<center>
								<h3>Username</h3></label><input type="text" name="username"><br>
								<h3>Password</h3><input type="password" name="password"> <br>
								<input type="submit" value="LOG IN" id="submit">
							</center>

		
			<p>
			<br>
							</p>
							<p>
							<!-- formaction="signupAdmin.jsp" -->
		<!-- <button type="submit"  class="btn btn-primary btn-block">Register Now</button> -->
	</p></form>

</body>
</html>