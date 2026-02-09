<%@ page import="java.util.ArrayList,models.Student" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css">
</head>
<body>
    <% ArrayList<Student> students = (ArrayList)request.getAttribute("records"); %>

    <div class="container">
        <div class="row justify-content-center">
            <div class="col-8 p-4 mt-5 border border-primary rounded bg-primary-subtle">
                <table class="table table-primary">
                    <thead>
                        <tr>
                            <th>Sr No.</th>
                            <th>Name</th>
                            <th>Age</th>
                            <th>College</th>
                            <th>Marks</th>
                        </tr>
                    </thead>
            
                    <tbody>
                        <% for(Student next : students) { %>
                        <tr>
                            <td><%= next.getStudentId() %></td>
                            <td><%= next.getName() %></td>
                            <td><%= next.getAge() %></td>
                            <td><%= next.getCollege() %></td>
                            <td><%= next.getMarks() %></td>
                            <td>
                                <a href="delete.do?student_id=<%= next.getStudentId() %>"><img src="del.png"></a>
                            </td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
            </div>
        </div>
    </div>  
    
    

<%--
</head>
<body>
    <h1 style="text-align: center;">Students Records........</h1>
  <% ArrayList<Student>students= (ArrayList) request.getAttribute("records"); %>
    <table border="1" align="center">
         <thead>
           <tr>
     <th>SNo.</th>
     <th>Name</th>
     <th>Age</th>
     <th>College</th>
     <th>Marks</th>
   </tr>  
         </thead>
       
  <tbody>
    <%  for( Student next:students  ) { %>
    <tr>
    <td><%= next.getStudentId()  %></td>
    <td><%= next.getName()  %></td>
    <td><%= next.getAge()  %></td>
    <td><%= next.getCollege()  %></td>
    <td><%= next.getMarks()  %></td>
    </tr>
          <% } %>
  </tbody> --%>


</table>  
</body>
</html>