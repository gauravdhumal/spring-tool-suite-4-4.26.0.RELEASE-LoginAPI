Login Service API

A simple Login & User Management REST API built using Java, Spring Boot, Spring Security, JWT Authentication, PostgreSQL, and Maven.

This project provides secure user authentication and authorization features including registration, login, forgot password, profile update, and logout functionality.

🚀 Features
User Registration
User Login Authentication
JWT Token Generation
Secure Password Encryption
Forgot Password API
Update User Profile
Logout Functionality
RESTful APIs
PostgreSQL Database Integration
Layered Architecture
Exception Handling
🛠️ Technologies Used
Java 17 / Java 8
Spring Boot
Spring Security
JWT (JSON Web Token)
PostgreSQL
Maven
Hibernate / JPA
REST APIs
📁 Project Structure
src/main/java
│
├── controller
│   └── UserController.java
│
├── service
│   └── UserService.java
│
├── repository
│   └── UserRepository.java
│
├── entity
│   └── User.java
│
├── security
│   └── JwtService.java
│
├── dto
│   └── LoginRequest.java
│
└── exception
    └── GlobalExceptionHandler.java
⚙️ Setup Instructions
1️⃣ Clone Repository
git clone https://github.com/your-username/login-service-api.git
2️⃣ Open Project

Import project into:

Eclipse
IntelliJ IDEA
VS Code
3️⃣ Configure Database

Update application.properties

spring.datasource.url=jdbc:postgresql://localhost:5432/login_service
spring.datasource.username=postgres
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
4️⃣ Run Application
mvn spring-boot:run

Application runs on:

http://localhost:8080
🔐 API Endpoints
Register User
POST /api/auth/register
Request Body
{
  "fullName": "Gaurav Dhumal",
  "email": "gaurav@gmail.com",
  "password": "123456"
}
Login User
POST /api/auth/login
Request Body
{
  "email": "gaurav@gmail.com",
  "password": "123456"
}
Forgot Password
POST /api/auth/forgot-password
Update User
PUT /api/user/update/{id}
Logout
POST /api/auth/logout
🔑 JWT Authentication

After successful login, JWT token will be generated.

Example:

{
  "token": "eyJhbGciOiJIUzI1NiJ9..."
}

Use token in headers:

Authorization: Bearer your_token
📌 Future Enhancements
Email Verification
Refresh Token
Role-Based Authorization
Docker Support
Swagger Documentation
Unit Testing
👨‍💻 Author

Gaurav Dhumal

Java Full Stack Developer
Spring Boot Developer
⭐ GitHub

If you like this project, give it a ⭐ on GitHub.
