<html>
<head>
    <title>Profile Page</title>
</head>
<body>
<%
String myname = (String) request.getAttribute("user_key");
%>
<h1>Welcome to profile page:<%= myname %></h1>
</body>
</html>