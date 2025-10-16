<html>
<head>
    <title>About us</title>
</head>
<body>
<%
String myname = (String) request.getAttribute("user_key");
%>
<h1>Welcome to About us page:<%= myname %></h1>
</body>
</html>