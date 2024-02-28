# Spring_Crud_Operation_Management
In this tutorial, we're gonna build a Spring Boot Rest CRUD API example with Maven that use Spring Data JPA to interact with H2 database. You'll know:

This is a simple Project Management System built using Java 17 and Spring Boot, with an in-memory database (H2) for data persistence. The system allows users to perform CRUD operations on project information via RESTful API endpoints.

## Table of Contents:

- Project Setup
- Database Configuration
- Model Creation
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

Define the schema for the 'Project' entity (attributes: id, name, description, startDate, endDate, etc.).

 ## Model Creation

Create a Project model class in the models package with annotations for JPA entity.

## Repository Layer

Create a ProjectRepository interface extending JpaRepository to handle data operations.

## Service Layer
Implement a ProjectService class to handle business logic.
Define methods for create, read, update, and delete operations.

## Controller Layer

Develop a ProjectController class to handle HTTP requests.
Map CRUD operations to RESTful endpoints (e.g., POST /projects, GET /projects/{id}, etc.)

## CRUD Operations
  
Create: Implement an endpoint to add a new project.

Read: Implement endpoints to retrieve all projects and a single project by ID.

Update: Implement an endpoint to update an existing project.

Delete: Implement an endpoint to delete a project by ID.

