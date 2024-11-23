<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Details Entry</title>
</head>
<body>
    <h1>Hello World</h1>
    <h2>ENTER THE STUDENT DETAILS</h2>
    <form action="http://localhost:8080/practice1/dbconnections" method="post">
        <p>Enter Name</p>
        <input type="text" name="sname" placeholder="Enter Student Name" required>

        <p>Enter Course</p>
        <input type="text" name="scourse" placeholder="Enter Course" required>

        <p>Enter Roll No</p>
        <input type="number" name="srollno" placeholder="Enter Roll Number" required>

        <p>Enter Birth Date</p>
        <input type="date" name="sdate" required>

        <p>Select Gender</p>
        <input type="radio" name="sgender" value="Male" required> Male
        <br>
        <input type="radio" name="sgender" value="Female" required> Female

        <br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
