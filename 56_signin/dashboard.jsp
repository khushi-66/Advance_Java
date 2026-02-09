<%@ page import="modals.user" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <% user u=(user)session.getAttribute("user"); %>
    <h1>Welcome <%= u.getname() %></h1>
</body>
</html>