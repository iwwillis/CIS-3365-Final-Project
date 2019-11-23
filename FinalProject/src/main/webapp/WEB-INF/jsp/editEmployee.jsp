<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Employee</title>
    <h1 style="text-align: center">Edit Employee</h1>
</head>
<body>



<hr/>
<form style="text-align: center" method="post" action="/saveEmployee">
    <input type="hidden" name="employeeid" value="${selectedItem.employeeID}">
    <br>First Name: <br>
    <input type="text" name="firstname" value="${selectedItem.firstName}">
    <br>Last name:<br>
    <input type="text" name="lastname" value="${selectedItem.lastName}">
    <br>Employee Status:<br>
    <input type="text" name="employeestatus" value="${selectedItem.employeeStatus}">
    <br><br>
    <input type="submit" value="Save Edit">
    <button><a href="/employeeView">Back</a></button>
</form>

</body>
</html>
