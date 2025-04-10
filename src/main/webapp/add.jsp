<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add to your ToDo List</title>

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
    <h2>Add new task</h2>
    <form action="todo-servlet" method="post">
        <input type="hidden" name="action" value="add">
        <input type="text" name="task" required>
        <button type="submit">Add</button>
    </form>
    <button><a href="todo-servlet">Your List</a></button>
</body>
</html>