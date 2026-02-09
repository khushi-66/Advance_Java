<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
 <link rel="stylesheet" href="./bootstrap-5.3.8-dist/css/bootstrap.min.css">
    <style>
       

        .danger {
            color: red;
            border: 1px solid red;
border-radius: 7px;
        }

        .success {
            color: green;
            border: 1px solid green;
        border-radius: 7px;
        }

       
       

          body{
    background-color:rgb(255, 251, 253); ;
}
      
        .box{
            text-align: center;
            
             border-radius: 7px;
            box-shadow: 7px 7px 3px rgb(231, 226, 226);
           display:inline-block;
           padding:90px;
         
           margin-left:33%;
           margin-top:60px;
           background-color: #fbfbfc;;
    
            
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
             color:rgb(241, 234, 232);
        }
        .btn{
          text-decoration: none;
          color:rgb(241, 234, 232);
       }

        .cc{
          margin-top:60px;
        }
    
    </style>
</head>
<body>
     <% Boolean flag = (Boolean)request.getAttribute("success"); %>
 <div class='box <%= flag?"success":"danger" %>'>
        <%= flag?"Verification Completed...":"Verification Failed..." %>
    <br><br>
          <div class="cc">
         <a href="signin.jsp" class="submit btn"> Back to SignIn</a>
         </div>
   </div>
  </body>
</html>