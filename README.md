# 🌐 EmployeeInfoPortal

**EmployeeInfoPortal** is a dynamic Java web application built using Servlets, JSP, and MySQL. It allows users to view a list of employees fetched from a MySQL database in real time. The project demonstrates full-stack Java EE development — from front-end user interaction to back-end database connectivity — and is ideal for beginners looking to build and deploy Java web apps using Apache Tomcat.

---

## 🚀 Features

- ✅ Display all employees from a MySQL database
- 🔄 Dynamic data rendering with JSP & Servlets
- 🔗 JDBC integration for database access
- 🎨 Clean, responsive UI with HTML and CSS
- 🖥️ Deployed on Apache Tomcat
- 🧠 Ideal for Java Full Stack learners

---

## 🧰 Tech Stack

| Layer       | Technology              |
|------------|--------------------------|
| Frontend    | HTML5, CSS3              |
| Backend     | Java Servlets, JSP       |
| Database    | MySQL + JDBC             |
| Web Server  | Apache Tomcat 9+         |
| IDE         | Eclipse (Java EE)        |
| Versioning  | Git & GitHub             |

---

## 📁 Project Structure

EmployeeInfoPortal/
├── WebContent/
│ ├── index.html
│ └── WEB-INF/
│ └── web.xml
├── src/
│ └── GetEmployees.java
├── lib/
│ └── mysql-connector-java-8.x.x.jar
├── README.md
└── .gitignore

---

## 🛠️ Setup Instructions

### ✅ Prerequisites

- Java JDK 17+
- Apache Tomcat 9+
- MySQL Server
- Eclipse IDE for Java EE Developers
- Git installed
- MySQL Connector/J JAR

---

### 📌 Step-by-step Setup

1. **Clone the Repository**

```bash
git clone https://github.com/vinaykumarr008/Employee-Info-Portal.git
Open in Eclipse
```

2. **Open Eclipse**
Go to File > Import > Existing Projects into Workspace

Select the cloned folder and import

3. **Configure Apache Tomcat**

Go to Servers tab in Eclipse

Add a new server runtime → Select Apache Tomcat v9

Add this project to the server

4. **Add MySQL Connector JAR**

Place the connector JAR in the /lib/ folder

Right-click project → Build Path → Add to Build Path

5. **Run the Project**

Start Tomcat server in Eclipse

Open in browser:
http://localhost:8080/EmployeeInfoPortal/GetEmployees
