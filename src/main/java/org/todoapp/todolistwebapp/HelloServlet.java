package org.todoapp.todolistwebapp;

import java.io.*;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Task> task = ToDoList.getList();
        request.setAttribute("todoItems", task);
        request.getRequestDispatcher("show.jsp").forward(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String action = request.getParameter("action");
        if ("add".equals(action)) {
            String item = request.getParameter("task");
            ToDoList.add(item);
        } else if ("delete".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            ToDoList.delete(id);
        } else if ("exit".equals(action)) {
            ToDoList.deleteAllTasks();
            request.setAttribute("exitMessage", "Exiting!");
            request.getRequestDispatcher("exit.jsp").forward(request, response);
        }
        List<Task> tasks = ToDoList.getList();
        request.setAttribute("todoItems", tasks);
        request.getRequestDispatcher("show.jsp").forward(request, response);
    }

    public void destroy() {
        ToDoList.deleteAllTasks();
        System.out.println("Servlet was destroyed");
        ToDoList.close();

        super.destroy();
    }
}