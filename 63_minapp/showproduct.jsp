<%@ page import="modals.user,java.util.ArrayList ,modals.product,modals.pic" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="./bootstrap-5.3.8-dist/css/bootstrap.min.css">
    <style>
        body{
             background-color: #f8f9fa;
        }
          .submit{
              box-shadow:2px 2px 7px rgb(206, 202, 202);
            padding:5px;
          border-radius: 7px;
             border: 1px solid rgb(74, 168, 173);;
            background-color: rgb(74, 168, 173);
             color:rgb(248, 238, 244);
             font-size: medium;
             text-decoration: none;
             display:inline;
             margin-bottom:10px;
        }
           
        .submit:hover{
             background-color:  rgb(100, 178, 187);
             border: 3px solid rgb(100, 178, 187);;
        }

        .submit2{
            box-shadow:2px 2px 7px rgb(206, 202, 202);
            padding:7px;
          border-radius: 7px;
             border: 1px solid rgb(74, 168, 173);;
            background-color: rgb(74, 168, 173);
             color:rgb(248, 238, 244);
             font-size: large;
             text-decoration: none;
             display:inline;
             margin-bottom:10px;
        }
           
        .submit2:hover{
             background-color:  rgb(100, 178, 187);
             border: 3px solid rgb(100, 178, 187);;
        }
        .m{
          margin-left:30px;
        }

</style>
</head>

<body>
    <div class="container-fluid mt-4">
      <div class="row">
        <div class="col-3">

<img src="picdownload.do?what=user_pic" height="150px"  alt="  Profile Photo" style="  border:1px solid rgb(145, 138, 138);border-radius :80%; width:150px;">

        </div>
     <div class="col-7">
 <% user u=(user)session.getAttribute("user"); %>
    <h1   style="   font-style:italic; font-size: 1200; color:  rgb(94, 168, 162)  ">Welcome   <%= u.getname() %> ............</h1>
   </div>
    <div class="col-2">
     <a href="addproductForm.html" class="submit vv">Add Product</a>
       <a href="dashboard.jsp" class="submit vv m">Back</a>
    </div>
      </div>
    </div>

  
   
   
    <%ArrayList<product>products=(ArrayList)request.getAttribute("product");%>
        
      <div class="container-fluid">
        <div class="text-center mt-4 mb-4">
          <h2 class="submit2" >
  Your Product Details
          <h2> </div>
         
        <div class="row m-8">  
          <div class="col">
    <table border="1"  width="60%"   class="mt-4 table-rounded table-responsive table table-bordered rounded  table-hover">
            <thead >
              <tr class="table-success" >
                 <th>Product Images</th>
                 <th>Product Name</th>
                  <th>Price</th>
                  <th>Quantity</th>
                 </tr>
                    </thead>
            <tbody>

               
                 <% for(product p:products) { %>
                   <tr >
                <%   ArrayList<pic>pics=p.getpics(); %>
                  <td>
                     <% for(pic pi:pics) { %>
                         
                         <img class="img-fluid" height= "150px"src="picdownload.do?what=product&path=<%= pi.getPath() %>" alt="product pic">
                           
                       

                      <% } %>
                  </td> 
                    <td ><%=  p.getName() %></td>
                   <td ><%=  p.getPrice() %></td>
                    <td ><%=  p.getQuantity() %></td>
                    <%  } %>
               </tr>
            </tbody>
        </table>


          </div>
        </div>
      </div>
  
    

    
     

    
    
    
  
</body>
</html>