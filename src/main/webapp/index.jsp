<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>ToDo List Web App Menu</title>

    <style>
        body {
            width: 300px;
            border: 15px solid green;
            margin: 20px;
            padding: 50px;
            text-align: center;
            color: green;
        }
        button, a {
            margin: 10px;
            color: green;
            text-decoration: none;
        }
        button:hover {
            color: darkgreen;
        }
    </style>
</head>

<body>
    <h1><%= "ToDo List Web App" %></h1>
    <h2><%= "What would you like to do?" %></h2>

    <button><a href="todo-servlet">view</a></button>
    <button><a href="add.jsp">add</a></button>
    <button><a href="delete.jsp">delete</a></button>

    <form action="todo-servlet" method="post">
        <input type="hidden" name="action" value="exit">
        <button type="submit">Exit</button>
    </form>
</body>
</html>