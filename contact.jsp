<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Raleway">
<title>Datax Shipments</title>
<style>
body {
	font-family: Raleway;
	background-color: #FDFEFE;
}

#header {
	float: left;
	width: 1505px;
	background-color: #00B2CD;
	z-index: 1000;
	box-shadow: 4px 4px 4px #BDC3C7;
	float: left;
}

#header ul {
	clear: left;
	float: right;
	list-style: none;
	margin: 0;
	padding: 0;
	position: relative;
	right: 50%;
	text-align: center;
}

#header ul li {
	margin: 0 0 0 1px;
	padding: 0;
	float: left;
	position: relative;
	left: 50%;
}

#header ul li a {
	display: block;
	margin: 0;
	padding: .8rem 1.8rem .8rem;
	background-color: #00B2CD;
	color: #fff;
	text-decoration: none;
	line-height: 2.4rem;
}

#header ul li.active a {
	background: #32c1d7;
	color: #fff;
}

#header ul li a:hover {
	background: #32c1d7;
	color: #fff;
}

#header ul li:hover a, #header ul li.hover a {
	background: #36f;
	color: #fff;
}

#header ul ul {
	display: none;
	position: absolute;
	top: 2em;
	left: 0;
	right: auto;
	width: 10em;
}

#header ul ul li {
	left: auto;
	margin: 0;
	clear: left;
	width: 100%;
}

#header ul ul li a, #header ul li.active li a, #header ul li:hover ul li a,
	#header ul li.hover ul li a {
	font-weight: normal;
	background: #eee;
	color: #444;
	line-height: 1.8rem;
	border-bottom: 1px solid #ddd;
}

#header ul ul li a:hover, #header ul li.active ul li a:hover, #header ul li:hover ul li a:hover,
	#header ul li.hover ul li a:hover {
	background: #d6d6d6;
	color: #000;
}

#header ul ul.last {
	left: auto; /* reset left:0; value */
	right: 0; /* Set right value instead */
}
#header ul ul ul {
	display: none;
	position: absolute;
	left: 100%;
	top: 0;
	border-left: .1rem solid #ddd;
}

#title {
	font-size: 30px;
	font-weight: 900;
	font-size-adjust: inherit;
}

#contactheader {
	font-size: 40px;
	font-weight: 900;
}
</style>
</head>
<body>
	<nav id="header">
	<ul>
		<li id="title"><a>Datax Shipments</a></li>
		<li><a id="home"href="home.do">Home</a></li>
		<li><a id="about"href="about.do">About</a></li>
		<li><a id="contact"href="contact.do">Contact Us</a></li>
	</ul>
	</nav>
	<center>
		<div id="contactheader">Contact Us</div>
		<ul type="none">
			<li><font class="info">City&nbsp;</font>Chicago</li>
			<li><font class="info">Street&nbsp;</font>200 E Randolph St </li>
			<li><font class="info">Floor no&nbsp;</font>25th Floor </li>
			<li><font class="info">Pincode&nbsp;</font>IL 60601-6501</li>
			<li><font class="info">Country</font>USA</li>
		</ul>
	</center>
</head>
</body>
</html>