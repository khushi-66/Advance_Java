 <%@ page import="modals.user" %> 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>

       .x{
            padding:10px;
            margin-bottom:15px;
            border-radius: 8px;
            border: 3px solid rgb(248, 248, 244);
             background-color:  rgb(66, 131, 138);
             font-size: medium;
              color:rgb(248, 238, 244);
        }
        .box{
            text-align: center;
             border:1px solid rgb(51, 47, 47);
             border-radius: 7px;
            box-shadow: 5px 5px 3px rgb(231, 226, 226);
           display:inline-block;
           padding:60px;
           margin-left:35%;
           margin-top:20px;
           background-color: rgb(245, 253, 249);
            
        }
        form{
            margin-top:30px;
           
        }

        .submit{
            padding:10px;
          border-radius: 7px;
            border: 1px solid rgb(44, 94, 94);;
            background-color: rgb(44, 94, 94);
             color:rgb(241, 234, 232);
        }

        .submit:hover{
            background-color:  rgb(66, 131, 138);
        }
        .btn{
          text-decoration: none;
          color:rgb(241, 234, 232);
          margin-left:97%;
          margin-bottom:10px;
          
        }
    </style>
</head>
<body>

        <%  String error = (String) request.getAttribute("error"); %>
        <% if(error != null){ %>
     <p style="color:rgb(212, 43, 43); text-align: center;">  <%=  error %> </p>
         <% } %>
       
  
      <div class="box">
        <button class="x">SignIn Form</button>
    
    <form  action="signin.do" method="post">
       Email : <input type="email" name="email" placeholder="type email"><br><br>
       Password : <input type="password" name="psb" placeholder="type password"> 
        <br><br>
         <input type="submit" value="Sign In"class="submit">
    </form><br><br>
    <a href="index.html" class="submit btn">Back</a>
    </div>
</body>
</html>