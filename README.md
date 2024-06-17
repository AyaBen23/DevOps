# Requirements to run the project:

- Have Docker and docker-compose installed.

# Build the project:
- Clone the repository.
- Run `docker-compose up -d` to launch the 3 services as follow:

```
184503366bde   dockertools_httpd      "httpd-foreground"       5 seconds ago        Up 4 seconds    0.0.0.0:8000->80/tcp, :::8000->80/tcp       dockertools_httpd_1
ef6ff9ce2a04   dockertools_backend    "java -jar simple-ap…"   6 seconds ago        Up 4 seconds    0.0.0.0:8080->8080/tcp, :::8080->8080/tcp   backendapi
328fd52c2872   dockertools_database   "docker-entrypoint.s…"   About a minute ago   Up 32 seconds   0.0.0.0:5432->5432/tcp, :::5432->5432/tcp   dockertools_database_1
```

To access the server, navigate to `http://localhost:8000` 

# Content of the project

This project contains three services:

- **Backend Service:** This service manages the backend logic of the application. Built using Spring Boot and Java, it handles API requests and interacts with the database.
- **Database Service:** Responsible for database operations, this service utilizes the PostgreSQL relational database.
- **Reverse Proxy Service:** This service routes requests to the appropriate service and is implemented using Apache Server.


# other 
