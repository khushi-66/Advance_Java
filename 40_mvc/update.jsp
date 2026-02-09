<%@ page import="java.util.ArrayList,models.Student" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
    <h1>Save Student </h1>
    <hr>
    <hr>
    <% Student s=(Student)request.getAttribute("students");%>
    <a href="show.do">Show Records...</a>
    <hr>
    <form action ="edit.do" method ="Post">
        <input type="hidden" name="student_id" value="<%s.getStudentId();%>" >
        <input type ="text" name="name" value= "<%s.getName();%>" placeholder ="enter your name"><br><br>
    <input type ="number" name="age"    value= "<%s.getAge();%>"placeholder ="enter your age"><br><br>
    <input type ="text" name="college"   value= "<%s.getCollege();%>"placeholder ="enter your college"><br><br>
   
    <input type ="text" name="marks"  value= "<%s.getMarks();%>"placeholder ="enter your Marks"><br><br>
   <input type="submit" value="Update">
    </form>
    
</body>
</html>