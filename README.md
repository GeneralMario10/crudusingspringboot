# 🛠️ Simple Staff CRUD with Spring Boot (In-Memory List Version)

This is a basic CRUD (Create, Read, Update, Delete) application built with **Java Spring Boot**.  
It manages a list of staff members using a simple `List` as the data store (i.e., **no database** like MySQL is used).

This project does **not** use `@RestController` or expose any REST APIs.  
Instead, it demonstrates how the CRUD logic can work internally using Java classes and Spring components.

---

## 📌 Features

- Add new staff member
- View all staff members
- Update existing staff member
- Delete a staff member

All operations are done in-memory using a `List<Staff>` inside a service class. Once the app stops, all data is lost.

---

## 📦 Technologies Used

- Java 17+ (or compatible)
- Spring Boot
- Spring Core / Dependency Injection
- Maven (or Gradle)


