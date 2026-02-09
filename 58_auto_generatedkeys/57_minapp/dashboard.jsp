<%@ page import="modals.user" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        body{
             background-color: rgb(245, 253, 249);
        }
          .submit{
            padding:10px;
          border-radius: 7px;
            border: 3px solid rgb(44, 94, 97);;
            background-color: rgb(44, 94, 97);
             color:rgb(248, 238, 244);
             font-size: large;
             text-decoration: none;
             display:inline;
        }
           
        .submit:hover{
            background-color:  rgb(66, 131, 138);
             border: 3px solid rgb(66, 131, 138);;
        }
.flex{
  display:flex;
  flex-wrap:nowrap;
  align-items: flex-end;
}
.vv{
    margin-left:60px;
    place-self: left;;
}

.aa{
  margin-top:2px;
   align-self: self-end;
}
     
    </style>
</head>
<body>
  <div class="flex">
   <img src="picdownload.do" height="200px"  alt="  Profile Photo" style="border-radius :80%; width:200px;">
    <% user u=(user)session.getAttribute("user"); %>
    <h1   style="margin-left:250px;   font-style:italic; font-size: 1200; color:  rgb(34, 95, 90); margin-top :120px;  ">Welcome   <%= u.getname() %> ............</h1>
    
    <div class="aa">
     <a href="addproductForm.html" class="submit vv">Add Product</a>

    <a href="showproduct.do" class="submit  vv">Show Products</a>
     
    </div>
    
    
    
  </div>
   
    <!-- <br><br><br>
    <a href="addproductForm.html" class="submit">Add Product</a>
    <br><br>
    <a href="showproduct.do" class="submit">Show Products</a> -->
    
</body>
</html>