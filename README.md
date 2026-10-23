# CityEye — Urban Problem Reporting System

CityEye is a web application that helps people report urban problems, such as broken street lights, road damage, garbage issues, and other city infrastructure problems.

The project combines a frontend built with HTML, CSS, and JavaScript with a REST API developed using Java and Spring Boot.

## Features

- View reported urban problems in a table.
- Submit new reports through a web form.
- Store report details such as title, description, location, and status.
- Assign an ID and a default status to each new report.
- Display report statuses, including `NEW`, `IN_PROGRESS`, and `RESOLVED`.
- Use a responsive web interface with a dark-mode toggle.

## Technology Stack

### Frontend
- HTML5
- CSS3
- JavaScript
- Fetch API for HTTP requests

### Backend
- Java 17
- Spring Boot
- Spring Web MVC
- Spring Validation dependency
- Maven

### Version Control
- Git
- GitHub

## Architecture

The application uses a frontend-backend architecture.

```text
User
 |
 v
CityEye Frontend
HTML + CSS + JavaScript
 |
 | HTTP requests (JSON)
 v
Spring Boot REST API
 |
 v
Report Controller
 |
 v
Report Service
 |
 v
In-memory Report List
```

### Frontend

The frontend provides the user interface for viewing and submitting reports.

Important files:
- `index.html` — home page.
- `reports.html` — displays the list of reports.
- `report.html` — form for submitting a new report.
- `script.js` — handles frontend interactions and API requests.
- `style.css` — application styles.
- `photo/` — images and visual assets.

### Backend

The backend is located in the `cityeye-backend/` directory.

Main components:

- `CityeyeBackendApplication.java` — Spring Boot application entry point.
- `Report.java` — report data model.
- `ReportController.java` — exposes REST API endpoints.
- `ReportService.java` — manages report data and assigns IDs.

The backend currently stores reports in memory. Report data is reset when the application restarts.

## REST API

Base URL:

```text
http://localhost:8080
```

### Get all reports

**GET** `/api/reports`

Returns all reports as a JSON array.

Example response:

```json
[
  {
    "id": 1,
    "title": "Broken street light",
    "description": "The street light does not work",
    "location": "Astana",
    "status": "NEW"
  }
]
```

### Create a report

**POST** `/api/reports`

Request body:

```json
{
  "title": "Broken road",
  "description": "There is a hole in the road",
  "location": "Astana",
  "status": "NEW"
}
```

The backend assigns an ID and sets the status to `NEW` when no status is provided.

## Getting Started

### Prerequisites

Install:
- Java Development Kit (JDK) 17 or later.
- Git.
- A web browser.

Maven Wrapper is included in the backend project.

### 1. Clone the repository

```bash
git clone https://github.com/vserxs/project.git
cd project
```

Replace the placeholders with your actual GitHub repository URL and folder name.

### 2. Start the backend

Open a terminal in the `cityeye-backend` directory.

On Windows PowerShell:

```powershell
.\mvnw.cmd spring-boot:run
```

On macOS or Linux:

```bash
./mvnw spring-boot:run
```

The backend should start on port `8080`.

### 3. Verify the API

Open the following URL in your browser:

```text
http://localhost:8080/api/reports
```

A JSON response should appear if the backend is running successfully.

### 4. Open the frontend

Open `index.html` in your browser, or use a local development server to serve the frontend files.

Keep the backend running while using features that send requests to the API.

## Current Limitations

- Reports are stored in memory and are not persistent.
- Photo upload is not connected to the backend.
- Authentication and authorization are not implemented.
- The frontend currently uses a local backend URL, so deployment requires updating the API address.
- The application is a prototype and needs additional validation and security improvements before production use.

## Future Improvements

- Add a database such as PostgreSQL.
- Implement user registration and authentication.
- Support photo uploads.
- Add filtering and searching for reports.
- Add automated tests for backend services and API endpoints.
- Deploy the frontend and backend.

## Team

CityEye was developed as a student team project.

- Arsen Sagidanov
- Alisher Balyasnyy

## License

No license has been specified yet.
