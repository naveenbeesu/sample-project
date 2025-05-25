# Car Marketplace Application

## Overview
The Car Marketplace Application is a web application built using Java and Spring Boot that allows users to buy, sell, and lease cars. The application provides a RESTful API for managing car listings and integrates with Azure DevOps for continuous integration and deployment.

## Features
- View all cars available for sale or lease
- Get details of a specific car by ID
- Create new car listings
- Update existing car listings
- Delete car listings

## Technologies Used
- Java
- Spring Boot
- Maven
- Azure DevOps
- JPA (Java Persistence API)
- H2 Database (for development)

## Project Structure
```
car-marketplace-app
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── carmarketplace
│   │   │               ├── CarMarketplaceApplication.java
│   │   │               ├── controller
│   │   │               │   └── CarController.java
│   │   │               ├── model
│   │   │               │   └── Car.java
│   │   │               ├── repository
│   │   │               │   └── CarRepository.java
│   │   │               └── service
│   │   │                   └── CarService.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── static
│   │           └── index.html
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── carmarketplace
│                       └── CarMarketplaceApplicationTests.java
├── .azure-pipelines
│   └── azure-pipelines.yml
├── pom.xml
└── README.md
```

## Setup Instructions
1. Clone the repository:
   ```
   git clone <repository-url>
   cd car-marketplace-app
   ```

2. Build the project using Maven:
   ```
   mvn clean install
   ```

3. Run the application:
   ```
   mvn spring-boot:run
   ```

4. Access the application at `http://localhost:8080`.

## Usage
- Use the provided endpoints to interact with the car listings:
  - `GET /cars` - Retrieve all cars
  - `GET /cars/{id}` - Retrieve a car by ID
  - `POST /cars` - Create a new car listing
  - `PUT /cars/{id}` - Update an existing car listing
  - `DELETE /cars/{id}` - Delete a car listing

## CI/CD
The project is configured with Azure DevOps for continuous integration and deployment. The pipeline is defined in the `.azure-pipelines/azure-pipelines.yml` file.

## License
This project is licensed under the MIT License.