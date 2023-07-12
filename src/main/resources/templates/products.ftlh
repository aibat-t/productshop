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
    <h1>Product shop</h1>
    <form action="/" method="get">
        <label for="title">
            <input type="text" name="title">
            <button type="submit">Search</button>
        </label>
    </form>
    <hr>
    <#list products as product>
        <div>
            <p><b>${product.title}</b></p>
            <p>${product.price} tg.</p>
            <a href="/product/${product.id}">More</a>
        </div>
        <#else>
        <h3>no products</h3>
    </#list>
    <hr>
    <h3>Create new product</h3>
    <form action="/product/create" method="post">
        <label for="title">
            Title:
            <input type="text" name="title">
        </label>
        <br>
        <label for="description">
            Description:
            <input type="text" name="description">
        </label>
        <br>
        <label for="price">
            Price:
            <input type="number" name="price">
        </label>
        <br>
        <label for="city">
            City:
            <input type="text" name="city">
        </label>
        <br>
        <label for="author">
            Author:
            <input type="text" name="author">
        </label>
        <br>
        <button type="submit">Add product</button>
    </form>
</body>
</html>