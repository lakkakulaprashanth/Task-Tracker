
# 📝 Task Tracker - Java Spring Boot Full Stack Project

A beginner-friendly full stack application that allows users to create, view, and manage simple tasks. This project is built using **Spring Boot** for the backend and **Thymeleaf** for the frontend UI.

---

## 📌 Project Overview

**Task Tracker** is a CRUD (Create, Read, Update, Delete) application where users can:
- Add a task with a title, description, and status.
- View all tasks in a tabular format.
- Mark tasks as complete.
- Delete or update tasks (in future enhancements).

This project is ideal for learning the fundamentals of:
- Spring Boot (REST APIs, MVC pattern)
- Thymeleaf (Java template engine for HTML rendering)
- JPA/Hibernate (database mapping and persistence)
- Basic Git & GitHub workflow

---

## ⚙️ Tech Stack

| Layer         | Technology Used                |
|---------------|--------------------------------|
| Frontend      | HTML + Thymeleaf Template Engine |
| Backend       | Java 17, Spring Boot 3          |
| Persistence   | JPA, Hibernate (ORM)            |
| Database      | H2 (in-memory DB for dev/test)  |
| Build Tool    | Maven                           |
| IDE           | IntelliJ IDEA or Eclipse        |
| Version Control | Git + GitHub                 |

---

## 🚀 Features

- 🔹 Add a new task with title, description, and status.
- 🔹 Display a list of all tasks.
- 🔹 Simple and intuitive web UI using Thymeleaf.
- 🔹 Clean MVC architecture separating controller, model, and repository.
- 🔹 RESTful routing and annotations using Spring.

---

## 🧑‍💻 How to Run the Project

### ✅ Prerequisites

- Java 17 installed
- Maven installed
- IDE like IntelliJ or Eclipse
- Internet connection (to download dependencies)

### 🛠 Steps

1. **Clone the Repository**
```bash
git clone https://github.com/lakkakulaprashanth/Task-Tracker.git
cd Task-Tracker
```

2. **Run the Application**
```bash
./mvnw spring-boot:run
```
or use IntelliJ's "Run" button on `TasktrackerApplication.java`.

3. **Access the Application**
Open your browser and go to:
```
http://localhost:8080
```

You should now see the task creation form and task list!

---

## 🖼️ UI Preview

Simple task creation form and task list displayed on the homepage.

![UI Screenshot](UI-preview.png)

---

## 🔍 Project Structure

```
Task-Tracker/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/tasktracker/
│   │   │       ├── controller/       # Handles HTTP requests
│   │   │       ├── model/            # Defines the Task entity
│   │   │       ├── repository/       # Interface to interact with DB
│   │   │       └── TasktrackerApplication.java
│   │   └── resources/
│   │       ├── templates/            # Thymeleaf HTML files
│   │       └── application.properties
│   └── test/                         # Unit tests
├── pom.xml                          # Maven build file
└── README.md                        # Project documentation
```

---

## 🛠 Annotations Used (For Beginners)

| Annotation              | Explanation                                                                 |
|-------------------------|-----------------------------------------------------------------------------|
| `@Entity`               | Marks class as a database entity                                            |
| `@Table(name = "tasks")`| Specifies the table name to map the entity                                  |
| `@Id`                   | Primary key identifier                                                      |
| `@GeneratedValue`       | Automatically generates ID values                                           |
| `@Column(nullable=false)` | Makes a field required (not null in DB)                                  |
| `@Controller`           | Marks a class as a Spring MVC controller                                   |
| `@GetMapping`, `@PostMapping` | Map HTTP GET and POST requests to methods                           |
| `@Autowired`            | Automatically injects the required Spring dependency                        |

---

## 🌱 Future Improvements

- ✅ Add edit/update task functionality
- ✅ Delete task functionality
- 🔒 Add user authentication
- 📦 Connect to a real MySQL or PostgreSQL database
- 🎨 Improve UI with Bootstrap or React

---

## 🤝 Contributing

Contributions are welcome! Feel free to fork the repo and submit pull requests.

---

## 📩 Contact

**Author:** Prashanth Lakkakula  
📧 Email: lakkakulaprashanth793@gmail.com  
🌐 GitHub: [lakkakulaprashanth](https://github.com/lakkakulaprashanth)

---

> 🔖 This project is a great first step into full stack Java development using Spring Boot and Thymeleaf. If you’re new to Java backend or want to understand how front-end integrates with it — this is for you!
