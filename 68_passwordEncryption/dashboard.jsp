<%@ page import="modals.user" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="./bootstrap-5.3.8-dist/css/bootstrap.min.css">
    <style>
        body{
             background-color: #f8f9fa;;
        }
          .submit{
            padding:7px;
          border-radius: 7px;
          box-shadow:2px 2px 7px rgb(206, 202, 202);
            border: 1px solid rgb(74, 168, 173);;
            background-color: rgb(74, 168, 173);
             color:rgb(248, 238, 244);
             font-size: medium;
             text-decoration: none;
             display:inline;
        }

         .m{
          margin-left:60px;
        }
            .mb{
          margin-left:160px;
        }
        .submit:hover{
            background-color:  rgb(100, 178, 187);
             border: 3px solid rgb(100, 178, 187);;
        }

        
       </style>
</head>
<body>
  <div class="container-fluid mt-4 ">
      <div class="row">

  <div class="col-2">
  <img src="picdownload.do?what=user_pic" height="150px"  alt="  Profile Photo" style=" border:1px solid rgb(116, 109, 109);border-radius :80%; width:150px;">
 
</div>


     <div class="col-7">
    <% user u=(user)session.getAttribute("user"); %>
    <h1   style="   font-style:italic; font-size: 900; color:  rgb(59, 151, 144)  ">Welcome   <%= u.getname() %> ............</h1>
   </div>


    <div class="col-3">
      <a href="addproductForm.html" class="submit">Add Product</a>
       <a href="show.do" class="submit m">Show Products</a>
    </div>

     
      </div>
    </div>

   
   
    
</body>
</html>