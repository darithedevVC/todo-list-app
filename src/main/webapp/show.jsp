<%@ page import="org.todoapp.todolistwebapp.Task" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Your ToDo List</title>

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
        button:hover, a:hover {
            color: darkgreen;
        }
        ul {
            list-style-type: none;
            padding: 0;
        }
        li {
            margin: 5px 0;
        }
    </style>
</head>
<body>
    <h2>ToDo List</h2>
    <ul>
        <%java.util.List<Task> items = (java.util.List<Task>) request.getAttribute("todoItems");
            if (items != null) {
                for (Task item : items) {%>
                    <li><%= item.getId() %>: <%= item.getTask() %></li>
                <%}
            } else {
                    System.out.println("No tasks in ToDo List. Add tasks.");
            }%>
        <button><a href="add.jsp">Add</a></button>
        <button><a href="delete.jsp">Delete</a></button>
        <button><a href="index.jsp">Menu</a></button>
    </ul>
</body>
</html>