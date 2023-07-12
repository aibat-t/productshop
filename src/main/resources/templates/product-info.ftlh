<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Product shop</title>
</head>
<body>
    <h1>Product information</h1
    <hr>
    <label for="title">
        Title:
        <input type="text" disabled name="title" value="${product.title}">
    </label>
    <br>
    <label for="description">
        Description:
        <input type="text" disabled name="description" value="${product.description}">
    </label>
    <br>
    <label for="price">
        Price:
        <input type="text" disabled name="price" value="${product.price}">
    </label>
    <br>
    <label for="city">
        City:
        <input type="text" disabled name="city" value="${product.city}">
    </label>
    <br>
    <label for="author">
        Author:
        <input type="text" disabled name="author" value="${product.author}">
    </label>
    <br>
    <form action="/product/delete/${product.id}" method="post">
        <button type="submit">Delete</button>
    </form>
</body>
</html>