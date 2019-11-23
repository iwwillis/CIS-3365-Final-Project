<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"     %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Order Manager</title>
    <h1>Orders</h1>
</head>
<body>

<table style="border: solid">
    <tr>
        <th>Order ID</th>
        <th>Customer ID</th>
        <th>Product ID</th>
        <th>Order Date</th>
        <th>Order Status</th>
        <th>Payment ID</th>
        <th>Employee ID</th>
    </tr>
    <c:forEach var = "item" items = "${orderList}">
        <tr>

            <td>${item.orderID}</td>
            <td>${item.customerID}</td>
            <td>${item.productID}</td>
            <td>${item.orderDate}</td>
            <td>${item.orderStatus}</td>
            <td>${item.paymentID}</td>
            <td>${item.employeeID}</td>
            <td><a href="/editOrder/${item.orderID}">Edit</a></td>
            <td><a href="/deleteOrder/${item.orderID}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<button><a href="/addOrder/${item.orderID}">Add Order</a></button>
<button><a href="/">Back</a></button>

</body>
</html>