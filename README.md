# Job Application Tracker
(Please check master branch for updated code base)
## Overview

The Job Application Tracker is a Spring Boot application designed to help users manage and track their job applications effectively. The application allows users to add, update, and delete job applications, add notes to each application, upload related documents, and set reminders for follow-ups. The project uses a PostgreSQL database to store data and includes a RESTful API to interact with the application.

## Features

- **User Management**: Users can create and manage their profiles.
- **Job Application Management**: Users can add, update, view, and delete job applications.
- **Application Notes**: Users can add and manage notes related to each job application.
- **Document Upload**: Users can upload and manage documents related to each job application.
- **Reminders**: Users can set and manage reminders for follow-up actions.
- **RESTful API**: Provides a RESTful API for interacting with the application.

## Technologies Used

- **Spring Boot**: For building the backend application.
- **Spring Data JPA**: For ORM and database interactions.
- **PostgreSQL**: As the relational database.
- **Lombok**: To reduce boilerplate code.
- **Docker**: For containerization and easy deployment of PostgreSQL and pgAdmin.

## ER Diagram
![job_application_tracker_er_diagram](https://github.com/ayushshawnfrost/SpringBoot-JPA-PostGreSQL/assets/23500476/3825e62d-7eb2-442f-9a5c-522be133f008)

## Getting Started

### Prerequisites

- Java 17
- Maven
- Docker

### Running the Application

1. **Clone the Repository**

    ```sh
    git clone https://github.com/yourusername/job-application-tracker.git
    cd job-application-tracker
    ```

2. **Build the Application**

    ```sh
    mvn clean install
    ```

3. **Run PostgreSQL and pgAdmin using Docker**

    - Ensure Docker is installed and running.
    - Create and start containers:

        ```sh
        docker-compose up -d
        ```

4. **Run the Spring Boot Application**

    ```sh
    mvn spring-boot:run
    ```

5. **Access pgAdmin**

    - Open your web browser and go to `http://localhost:80`.
    - Log in with the credentials specified in the `docker-compose.yml` file.
    - Connect to the PostgreSQL server using the details provided in the `docker-compose.yml` file.

### Application Configuration

Configure the application properties in `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/job_tracker
spring.datasource.username=postgres
spring.datasource.password=mysecretpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
