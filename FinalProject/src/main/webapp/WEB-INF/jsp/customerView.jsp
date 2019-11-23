<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"     %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Customer Manager</title>
    <h1>Customers</h1>
</head>
<body>

<table style="border: solid">
    <tr>
        <th>Customer ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Street</th>
        <th>City</th>
        <th>State</th>
        <th>Zipcode</th>
        <th>Email</th>
        <th>Phone</th>
    </tr>
    <c:forEach var = "item" items = "${customerList}">
        <tr>

            <td>${item.customerID}</td>
            <td>${item.firstName}</td>
            <td>${item.lastName}</td>
            <td>${item.street}</td>
            <td>${item.city}</td>
            <td>${item.state}</td>
            <td>${item.zip}</td>
            <td>${item.email}</td>
            <td>${item.phone}</td>
            <td><a href="/editCustomer/${item.customerID}">Edit</a></td>
            <td><a href="/deleteCustomer/${item.customerID}">Delete</a></td>
        </tr>
    </c:forEach>
</table>

<div>
    <button><a href="/addCustomer/${item.customerID}">Add Customer</a></button>
    <button><a href="/">Back</a></button>
</div>



</body>
</html>