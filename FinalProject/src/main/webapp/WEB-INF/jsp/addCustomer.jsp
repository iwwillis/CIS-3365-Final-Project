<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Customer</title>
    <h1 style="text-align: center">Add Customer</h1>
</head>
<body>
<form style="text-align: center" method="post" action="/saveCustomer">
    <input type="hidden" name="customerid" value="">
    First Name:<br>
    <input type="text" name="firstname">
    <br>
    Last Name:<br>
    <input type="text" name="lastname" >
    <br>
    Street:<br>
    <input type="text" name="street">
    <br>
    City:<br>
    <input type="text" name="city" >
    <br>State: <br>
    <input type="text" name="state">
    <br>Zipcode:<br>
    <input type="text" name="zipcode" >
    <br>Email:<br>
    <input type="text" name="email">
    <br>Phone:<br>
    <input type="text" name="phone" >
    <br><br>
    <input type="submit" value="Submit">
    <button><a href="/customerView">Back</a></button>
</form>

</body>
</html>