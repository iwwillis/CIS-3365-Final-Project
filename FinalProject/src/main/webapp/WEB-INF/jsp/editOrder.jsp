<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Order</title>
    <h1 style="text-align: center">Edit Order</h1>
</head>
<body>



<hr/>
<form style="text-align: center" method="post" action="/saveOrder">
    <input type="hidden" name="orderid" value="${selectedItem.orderID}">
    <br>Customer ID: <br>
    <input type="text" name="customerid" value="${selectedItem.customerID}">
    <br>Product ID:<br>
    <input type="text" name="productid" value="${selectedItem.productID}">
    <br>Order Date: <br>
    <input type="text" name="orderdate" value="${selectedItem.orderDate}">
    <br>Order Status<br>
    <input type="text" name="orderstatus" value="${selectedItem.orderStatus}">
    <br>Payment ID: <br>
    <input type="text" name="paymentid" value="${selectedItem.paymentID}">
    <br>Employee ID:<br>
    <input type="text" name="employeeid" value="${selectedItem.employeeID}">
    <br><br>
    <input type="submit" value="Save Edit">
    <button style="text-align: center"><a href="/orderView">Back</a></button>
</form>

</body>
</html>
