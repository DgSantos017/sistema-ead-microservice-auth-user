System EAD Microservice auth user
![image](https://github.com/DgSantos017/sistema-ead-microservice-auth-user/assets/62971277/0d33bf5f-7cce-4d70-b48d-d88db6eb9f24)

### baseUrl -> http://localhost:8087/

# API Rest Features
- registerUser -> auth/signup
- getAllUsers -> users
- getOneUser -> users/userId
- updateUser -> users/userId
- deleteUser -> users/userId
- updatePassword -> users/password/userId
- updateImage -> users/image/userId

## Requirements to Run Locally
- Java: Version 11 or higher
- PostgreSQL

## Stacks
- Java 11
- Spring Boot 2.5.4
- Log4j2
- Spring Data JPA
- PostgreSQL
- Spring Validation
- Spring Hateoas

# Tools
- Linux
- IntelliJ IDE
- Insomnia
- DBeaver

# How to Run?
- Fork and clone this repository
- Download dependencies; if using IntelliJ, you can trigger Maven to handle this process automatically
- Replace the database credentials (PostgreSQL) in the ``application.yml`` file with your local machine's credentials
- From the ``AuthuserApplication`` file, execute the project; if everything is correct, the API will run on port 8087
- Refer to the endpoints for accessing the resources in the ``requestsInsomnia.json`` file located at the root of this repository

Developed by [Diogo Ferreira](https://www.linkedin.com/in/diogo-santos01/)
