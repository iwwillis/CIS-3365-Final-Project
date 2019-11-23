<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Order</title>
    <h1 style="text-align: center">Add Order</h1>
</head>
<body>
<form style="text-align: center" method="post" action="/saveOrder">
    <input type="hidden" name="orderid" value="">
    Customer ID:<br>
    <input type="text" name="customerid">
    <br>
    Product ID:<br>
    <input type="text" name="productid" >
    <br>
    Order Date:<br>
    <input type="text" name="orderdate" >
    <br>
    Order Status:<br>
    <input type="text" name="orderstatus" >
    <br>
    Payment ID:<br>
    <input type="text" name="paymentid" >
    <br>
    Employee ID:<br>
    <input type="text" name="employeeid" >
    <br><br>
    <input type="submit" value="Submit">
    <button style="text-align: center"><a href="/orderView">Back</a></button>
</form>

</body>
</html>