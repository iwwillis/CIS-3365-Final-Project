<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Employee</title>
    <h1 style="text-align: center">Add Employee</h1>
</head>
<body>
<form style="text-align: center" method="post" action="/saveEmployee">
    <input type="hidden" name="employeeid" value="">
    First Name:<br>
    <input type="text" name="firstname">
    <br>
    Last Name:<br>
    <input type="text" name="lastname" >
    <br>
    Employee Status:<br>
    <input type="text" name="employeestatus" >
    <br><br>
    <input type="submit" value="Submit">
    <button><a href="/employeeView">Back</a></button>
</form>

</body>
</html>