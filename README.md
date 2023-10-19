# Systemema EAD Microservice Auth User
![image](https://github.com/DgSantos017/sistema-ead-microservice-auth-user/assets/62971277/bfa07a60-24d1-467d-8a2b-d9af5cdae751)

### Sumário:

* [Sobre a API](#sobre-a-api)
* [Execução do projeto](#execu%C3%A7%C3%A3o-do-projeto)
* [Acessando a aplicação](#acessando-a-aplica%C3%A7%C3%A3o)
* [Tecnologias](#tecnologias)
* [Ferramentas utilizadas](#ferramentas-utilizadas)

## Sobre a API

Microservice projetado para oferecer funcionalidades de registro e login de usuários, por meio de autenticação e autorização na nossa plataforma de ensino a distância (EAD). Esses usuários podem abranger uma ampla variedade de perfis, incluindo novos alunos em busca de cursos, estudantes, instrutores e administradores.

Uma vez que um usuário é registrado, seus dados essenciais para operações relacionadas a cursos são automaticamente encaminhados ao Microservice de Cursos e Pagamentos. Isso é realizado por meio de eventos assíncronos, utilizando o sistema de mensageria RabbitMQ. Essa abordagem visa otimizar o desempenho e a eficiência, evitando a necessidade de buscar esses dados repetidamente sempre que uma operação interna for necessária


## Execução do projeto

[Voltar ao início](#sum%C3%A1rio)

Para rodar a aplicação, será necessário ter instalado:

* **Java 17**
* **PostgreSQL**

## Acessando a aplicação

[Voltar ao início](#sum%C3%A1rio)

Eu disponibilizei as collections do Postman para download no link abaixo, basta baixar e importar em seu postman.

## Tecnologias

[Voltar ao início](#sum%C3%A1rio)

* **Java 17**
* **Spring Boot 3**
* **RabbitMQ**
* **API REST**
* **PostgreSQL**

# Ferramentas utilizadas

[Voltar ao início](#sum%C3%A1rio)

* **IntelliJ IDEA Community Edition**
* **Postman**
* **Linux**
* * **DBeaver**

Developed by [Diogo Ferreira](https://www.linkedin.com/in/diogo-santos01/)

