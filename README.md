# Product REST API

## Overview
This is a Spring Boot application that provides a RESTful API for managing products.  
It supports CRUD operations (Create, Read, Update, Delete) with validation, basic authentication, and persistence using MySQL.  
Swagger UI is included for API documentation and testing.(http://localhost:8080/swagger-ui/index.html#/)

---

## Features
- CRUD operations for `Product` entity
- Input validation using JSR 380 (Bean Validation)
- Global exception handling with custom error messages
- Basic authentication (`Username: admin`, `Password: admin123`)
- MySQL database integration
- API documentation with Swagger UI

---

## Technologies Used
- Java 17
- Spring Boot 3.5.5
- Spring Data JPA
- Spring Web
- Spring Security
- Hibernate
- MySQL
- Maven
- Swagger / OpenAPI

---
API Endpoints
HTTP Method	Endpoint	Description
GET	    /products	            Get all products
GET	    /products/{id}	      Get a product by ID
POST	  /products	          Create a new product
PUT	    /products/{id}	      Update an existing product
DELETE	/products/{id}	  Delete a product



