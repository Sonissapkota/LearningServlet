<html>
<head>
    <title>Profile Page</title>
</head>
<body>
<%
String myname = (String) request.getAttribute("user_key");
%>
<h1>Welcome to profile page:<%= myname %></h1>

<a href="about.jsp">About us</a><br>
<a href="privacy.jsp">Privacy Policy</a>
</body>
</html>