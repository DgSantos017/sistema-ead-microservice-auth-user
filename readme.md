# System EAD Microservice auth user
![image](https://github.com/DgSantos017/sistema-ead-microservice-auth-user/assets/62971277/0d33bf5f-7cce-4d70-b48d-d88db6eb9f24)

### baseUrl -> http://localhost:8087/

# How to Run?
- Fork and clone this repository
- Download dependencies; if using IntelliJ, you can trigger Maven to handle this process automatically
- Replace the database credentials (PostgreSQL) in the ``application.yml`` file with your local machine's credentials
- From the ``AuthuserApplication`` file, execute the project; if everything is correct, the API will run on port 8087

## Where can I access the endpoints?
I have shared a workspace in Insomnia with all the endpoints. If you would like to access it, please click on the link below:

https://github.com/DgSantos017/sistema-ead-microservice-service-registry/blob/master/requestsInsominia.json
![image](https://github.com/DgSantos017/sistema-ead-microservice-auth-user/assets/62971277/acf5333d-4fea-4a6f-9171-2c8da442039f)
When accessing this link, click on the red-highlighted download button in the screenshot above, and if you have Insomnia installed on your machine, simply import it

## !!! Attention !!!
This microservice relies on the operation of the three microservices listed below. I'll provide the links for each, and you'll find documentation similar to this in their respective readme.md files. Simply follow the provided instructions to set them up.

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

Developed by [Diogo Ferreira](https://www.linkedin.com/in/diogo-santos01/)
