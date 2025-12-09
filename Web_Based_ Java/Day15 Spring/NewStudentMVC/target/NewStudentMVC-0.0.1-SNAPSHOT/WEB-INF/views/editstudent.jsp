<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/NewStudentMVC/student/updateStudent" method="post">
Student Id : <input type="text" name="sid" id="sid" value=${st.pid} readonly><br>
Student Name : <input type="text" name="sname" id="sname" value=${st.sname}><br>
Maths marks : <input type="text" name="maths" id="maths" value=${st.maths}><br>
Science Marks : <input type="text" name="science" id="science" value=${st.science}><br>
English marks : <input type="text" name="english" id="english" value=${st.english}><br>

<button type="submit" name="btn" id="update" value="update">Update Student</button>

</form>
</body>
</html>