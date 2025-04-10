# ToDo List Web Application

A simple Java web application for managing a ToDo list using:
- JSP & Servlets
- Hibernate (JPA)
- MySQL
- Maven
- Apache Tomcat

Features include: add, view, and delete tasks

---

## Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/todo-list-app.git
cd todo-list-app
```

### 2. Configure Database

In the `persistance.xml` file replace the database url, username, and password with your own

### 3.Build the WAR File

```bash
mvn clean package
```

### 4.Build the WAR File

Copy the generated `.war` file to your Tomcat's "webapps" folder and deploy using
```bash
startup.sh
```

---