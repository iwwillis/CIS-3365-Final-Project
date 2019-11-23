<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Product</title>
    <h1 style="text-align: center">Add Product</h1>
</head>
<body>
<form style="text-align: center" method="post" action="/saveProduct">
    <input type="hidden" name="productid" value="">
    Product Name:<br>
    <input type="text" name="productname">
    <br>
    Price:<br>
    <input type="text" name="price" >
    <br><br>
    <input type="submit" value="Submit">
    <button style="text-align: center"><a href="/productView">Back</a></button>
</form>

</body>
</html>