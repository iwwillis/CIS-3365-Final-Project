<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"     %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Employee Manager</title>
    <h1>Employees</h1>
</head>
<body>

<table style="border: solid">
    <tr>
        <th>Employee ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Employee Status</th>
    </tr>
    <c:forEach var = "item" items = "${list}">
        <tr>

            <td>${item.employeeID}</td>
            <td>${item.firstName}</td>
            <td>${item.lastName}</td>
            <td>${item.employeeStatus}</td>
            <td><a href="/editEmployee/${item.employeeID}">Edit</a></td>
            <td><a href="/deleteEmployee/${item.employeeID}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<button><a href="/addEmployee/${item.employeeID}">Add Employee</a></button>
<button><a href="/">Back</a></button>


</body>
</html>