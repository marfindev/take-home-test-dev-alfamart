
# Take Home Test Dev - Alfamart

## Introduction

This project is a **Spring Boot** application designed for managing student (Mahasiswa) data. It provides a web-based interface for adding, editing, and displaying Mahasiswa records. The application uses **Spring Boot**, **Thymeleaf** for templating, and **Spring Data JPA** for data persistence.

---

## Table of Contents

- [Introduction](#introduction)
- [Installation](#installation)
- [Usage](#usage)
- [Features](#features)
- [Project Structure](#project-structure)
- [Dependencies](#dependencies)
- [Configuration](#configuration)
- [Documentation](#documentation)
- [Examples](#examples)
- [Troubleshooting](#troubleshooting)
- [Contributors](#contributors)
- [License](#license)

---

## Installation

### Prerequisites
- Java 17+ (Recommended)
- Maven
- IDE (IntelliJ, Eclipse, etc.)

### Steps
1. Clone the repository.
   ```bash
   git clone <repository-url>
   ```
2. Navigate into the project directory.
   ```bash
   cd take-home-test-dev-alfamart-master
   ```
3. Build the project using Maven.
   ```bash
   ./mvnw clean install
   ```
4. Run the application.
   ```bash
   ./mvnw spring-boot:run
   ```
5. Access the application at:
   ```
   http://localhost:8080
   ```

---

## Usage

### Available Endpoints

| URL                          | Method | Description                     |
|------------------|-------|-------------------|
| `/`                            | GET    | Home page (list of students) |
| `/new`                      | GET    | Form to add a new Mahasiswa |
| `/edit/{id}`               | GET    | Form to edit a Mahasiswa |
| `/save`                     | POST   | Save new or updated Mahasiswa |
| `/delete/{id}`            | GET    | Delete a Mahasiswa |

---

## Features

- Add new Mahasiswa records.
- Edit existing Mahasiswa records.
- Delete Mahasiswa records.
- List all Mahasiswa in a table.
- Simple web interface using **Thymeleaf**.

---

## Project Structure

```
src
├── main
│   ├── java
│   │   └── com.jrp.mfn
│   │       ├── controller        # Controllers handling HTTP requests
│   │       ├── model              # Mahasiswa entity
│   │       ├── repository         # JPA repository interface
│   │       ├── service            # Service layer
│   │       └── TestDevAlfapopMarfinApplication.java   # Main Application class
│   ├── resources
│   │   ├── application.properties # Application configuration
│   │   └── templates              # Thymeleaf templates (HTML pages)
└── test
    └── java
        └── com.jrp.mfn
            └── TestDevAlfapopMarfinApplicationTests.java
```

---

## Dependencies

Key dependencies listed in `pom.xml`:

- Spring Boot Starter Web
- Spring Boot Starter Thymeleaf
- Spring Boot Starter Data JPA
- H2 Database (for in-memory data)
- Spring Boot Starter Test

---

## Configuration

Located in:
```
src/main/resources/application.properties
```

Example configuration:
```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password

spring.jpa.hibernate.ddl-auto=update
```

---

## Documentation

- Controller: `MahasiswaController.java`
- Service: `MahasiswaService.java`, `MahasiswaServiceImpl.java`
- Repository: `MahasiswaRepository.java`
- Entity: `Mahasiswa.java`
- Views: Thymeleaf templates for listing, editing, and creating Mahasiswa.

---

## Examples

### Adding a New Mahasiswa

1. Go to `/new`.
2. Fill out the form.
3. Click save.

### Editing an Existing Mahasiswa

1. On the homepage (`/`), click the **Edit** button next to a Mahasiswa.
2. Modify the details.
3. Click save.

---

## Troubleshooting

### Common Issues

| Issue                                  | Solution                                      |
|--------------------------------|------------------------------------|
| Application won't start  | Check Java version, Maven logs |
| Database issues                | Ensure H2 settings are correct   |
| Templates not found     | Verify template files in `/resources/templates` |

---

## Contributors

- Marfin (Author)

---

## License

This project is licensed under the MIT License - see the LICENSE file for details.
