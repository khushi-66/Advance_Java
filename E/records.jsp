
<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
     <style>

        .box3{
            background-color: rgb(13, 71, 71);
             display:inline-block;
             border:3px solid  rgb(13, 71, 71);
             border-radius: 10px;
             margin-right:10px;
            margin-top:15px;
            color:white;
            padding:10px;
             
        }
    </style>
</head>
<body>
    <%   ArrayList<String>arr=(ArrayList)request.getAttribute("parameter");%>
     <div class="box" style="text-align: center;background-color:rgb(211, 226, 204);padding:10px;">
        <h1>Form Data</h1>
        <table border="1" align="center" width="50%">
            
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Password</th>
        </tr>
        <tr>
            <% for (String next:arr)  { %>
            <td><%= next %></td>
            <% } %>
        </tr>
    </table>
    <a href="index.html" class="box3">Go To Back..</a>
    

     </div>
     

</body>
</html>