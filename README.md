# Product Menagement System

Product Menagement System is a system where you can manage the products by adding or deleting them.

## What's inside

This project is based on the [Spring Boot](https://spring.io/projects/spring-boot) project and uses these packages:
* Maven
* SpringBoot Starter
* SpringBoot Starter Data JPA
* MySQL connector JAVA
* SpringBoot Starter Web
* SpringBoot Starter Test
* [Junit](https://junit.org/junit4/dependency-info.html)

## Installation

The project is created with Maven, so you just need to import it to your IDE and build the project to resolve the dependencies.

## Database configuration

Create a MySQL database with the name ```product``` and add the credentials to ```/resources/application.properties```.
The default ones are:

```
spring.datasource.driverClassName=com.mysql.jdbc.Driver
spring.jba.hibernate.ddl-auto=none
spring.datasource.url=jdbc:mysql://localhost:3306/product
spring.datasource.username=root
spring.jpa.database-platform=org.hibernate.dialect.MySqlDialect
```

## Usage

Start your apache than run the project and head out yo your localhost.
