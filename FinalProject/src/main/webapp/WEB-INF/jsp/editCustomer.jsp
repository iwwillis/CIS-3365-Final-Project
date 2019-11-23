<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Customer</title>
    <h1 style="text-align: center">Edit Customer</h1>
</head>
<body>



<hr/>
<form style="text-align: center" method="post" action="/saveCustomer">
    <input type="hidden" name="customerid" value="${selectedItem.customerID}">
    <br>First Name: <br>
    <input type="text" name="firstname" value="${selectedItem.firstName}">
    <br>Last name:<br>
    <input type="text" name="lastname" value="${selectedItem.lastName}">
    <br>Street:<br>
    <input type="text" name="street" value="${selectedItem.street}">
    <br>City:<br>
    <input type="text" name="city" value="${selectedItem.city}">
    <br>State: <br>
    <input type="text" name="state" value="${selectedItem.state}">
    <br>Zipcode:<br>
    <input type="text" name="zipcode" value="${selectedItem.zip}">
    <br>Email:<br>
    <input type="text" name="email" value="${selectedItem.email}">
    <br>Phone:<br>
    <input type="text" name="phone" value="${selectedItem.phone}">
    <br><br>
    <input type="submit" value="Save Edit">
    <button><a href="/customerView">Back</a></button>
</form>

</body>
</html>
