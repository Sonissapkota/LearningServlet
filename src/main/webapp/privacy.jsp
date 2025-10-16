<html>
<head>
    <title>Privacy Policy</title>
</head>
<body>
<%
String myname = (String) request.getAttribute("user_key");
%>
<h1>Welcome to privacy policy page:<%= myname %></h1>
</body>
</html>