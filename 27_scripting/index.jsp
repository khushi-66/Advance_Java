<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>index page </h1>
    <hr>
    <% ArrayList<String>names=new ArrayList<String>();%>
       <% names.add("mohan"); %>
 <% names.add("rohan"); %>
  <% names.add("sohan"); %>
   <% names.add("gohan");
    names.add("tohan"); %>
     <% names.add("ayushi"); %>
 <hr>
 <h1>all records </h1>
 
      

       <% for(String next:names){ %>
            <h1><%=next %></h1>

            <% } %>
        
       
  

</body>
</html>