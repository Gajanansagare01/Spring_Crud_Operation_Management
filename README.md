# Spring_Crud_Operation_Management
In this tutorial, we're gonna build a Spring Boot Rest CRUD API example with Maven that use Spring Data JPA to interact with H2 database.

This is a simple Project Management System built using Java 17 and Spring Boot, with an in-memory database (H2) for data persistence. The system allows users to perform CRUD operations on project information via RESTful API endpoints.

## Model Creation

1. Repository Layer
2. Service Layer
3. Controller Layer
4. CRUD Operations
 ## Project Setup
 Initialize a new Spring Boot project using Spring Initializr.
 Include dependencies: Spring Web, Spring Data JPA, H2 Database.
 Set up the project structure with appropriate packages (controllers, services, repositories, models, etc.).

## Database Configuration


Configure the H2 in-memory database in application.properties.

Define the schema for the 'Project' entity (attributes: id, Book_name , Author, Price of BOok etc.).

 ## Model Creation

Created a Project model class in the models package with annotations for JPA entity.

## Repository Layer

Created a ProjectRepository interface extending JpaRepository to handle data operations.

## Service Layer

Implemented a ProjectService class to handle business logic.
Define methods for create, read, update, and delete operations.

## Controller Layer

Developd a ProjectController class to handle HTTP requests.
Map CRUD operations to RESTful endpoints (e.g., POST /projects, GET /Book/{id}, etc.)

## CRUD Operations
  
Create: Implement an endpoint to add a new Book.

Read: Implement endpoints to retrieve all Books and a single Book by ID.

Update: Implement an endpoint to update an existing Book.

Delete: Implement an endpoint to delete a Book by ID.
## Outpus:

![Books_3_sprongboot](https://github.com/Gajanansagare01/Spring_Crud_Operation_Management/assets/121687841/81e71167-22f7-4cb9-aca6-56da2a423ff5)


![Book_2_sprongboot](https://github.com/Gajanansagare01/Spring_Crud_Operation_Management/assets/121687841/bcb76650-45c6-48d4-a182-ab7060906475)


