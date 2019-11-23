<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Product</title>
    <h1 style="text-align: center">Edit Product</h1>
</head>
<body>



<hr/>
<form style="text-align: center" method="post" action="/saveProduct">
    <input type="hidden" name="productid" value="${selectedItem.productID}">
    <br>Product Name: <br>
    <input type="text" name="productname" value="${selectedItem.productName}">
    <br>Price:<br>
    <input type="text" name="price" value="${selectedItem.price}">
    <br><br>
    <input type="submit" value="Save Edit">
    <button style="text-align: center"><a href="/productView">Back</a></button>
</form>

</body>
</html>
