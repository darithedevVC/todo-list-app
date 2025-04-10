<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Exiting!</title>
    <style>
      body {
        width: 300px;
        height: 210px;
        border: 15px solid green;
        margin: 20px;
        padding: 50px;
        text-align: center;
        color: green;
      }
    </style>
  </head>
  <body>
  <h2><%= request.getAttribute("exitMessage") %></h2>
  <p>You can now close this web page.</p>
  </body>
</html>
