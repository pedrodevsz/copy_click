# Copy Events Analytics Backend

## Overview

This project is a backend service built with Spring Boot designed to collect and store copy events (Ctrl+C) performed by users within a website. The service exposes REST APIs that allow a frontend application to send information about copied content and retrieve stored analytics data.

The main purpose of this backend is to support analytics features such as identifying which parts of a page users copy the most, enabling insights about content usage.

## Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Lombok
* H2 Database (for development)

## Architecture

The project follows a layered architecture commonly used in professional Spring applications:

Controller → Service → Repository → Database

**Controller**
Handles HTTP requests and exposes REST endpoints.

**Service**
Contains the business logic and coordinates data processing.

**Repository**
Handles database access using Spring Data JPA.

**Entity**
Represents the database model for copy events.

**DTO**
Transfers request data between the client and the backend.

## How It Works

1. A frontend application detects when a user copies text within a page.
2. The frontend sends a POST request to the backend API with information about the copied content.
3. The backend receives the request through a controller.
4. The service layer processes the data and creates a copy event entity.
5. The repository persists the event in the database.
6. The stored data can later be retrieved through API endpoints for analytics or dashboards.

## API Endpoints

### Register a Copy Event

POST /api/copy-events

Example request body:

```json
{
  "copiedText": "Example copied content",
  "pageUrl": "/blog/example",
  "elementTag": "P",
  "elementId": "paragraph-1",
  "elementClass": "article-text"
}
```

### Get All Copy Events

GET /api/copy-events

Returns a list of all stored copy events.

### Get Events by Page

GET /api/copy-events/page?url=/blog/example

Returns copy events filtered by page URL.

## Running the Application

1. Clone the repository
2. Ensure Java 17+ is installed
3. Run the application using Maven or your IDE

Example:

```
./mvnw spring-boot:run
```

The application will start on:

```
http://localhost:8080
```

## H2 Database Console

For development, the project uses the H2 in-memory database.

Access the console at:

```
http://localhost:8080/h2-console
```

Connection configuration:

```
JDBC URL: jdbc:h2:mem:analyticsdb
User: sa
Password: (empty)
```

## Project Structure

```
src/main/java
 ├── controller
 ├── service
 ├── repository
 ├── entity
 └── dto
```
