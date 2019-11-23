<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"     %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Product Manager</title>
    <h1>Products</h1>
</head>
<body>

<table style="border: solid">
    <tr>
        <th>Employee ID</th>
        <th>Product Name</th>
        <th>Price</th>
    </tr>
    <c:forEach var = "item" items = "${productList}">
        <tr>

            <td>${item.productID}</td>
            <td>${item.productName}</td>
            <td>${item.price}</td>
            <td><a href="/editProduct/${item.productID}">Edit</a></td>
            <td><a href="/deleteProduct/${item.productID}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<button><a href="/addProduct/${item.productID}">Add Product</a></button>
<button><a href="/">Back</a></button>

</body>
</html>