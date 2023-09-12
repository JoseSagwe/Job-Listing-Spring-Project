# Job-Listing-Spring-Project BACKEND APIs

# Job Listing Project


## Overview

This is a job listing project built with Spring Boot and MongoDB, allowing you to create and search job posts. It includes RESTful APIs for managing job posts and a search feature based on text queries.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [API Documentation](#api-documentation)
- [Contributing](#contributing)
- [License](#license)

## Installation

1. **Clone the repository:**

   ```shell
   git clone https://github.com/your-username/job-listing-project.git
   cd job-listing-project
   ```

2. **Build and run the project:**

   ```shell
   ./mvnw spring-boot:run
   ```

   The application will start, and you can access it at `http://localhost:8080`.

3. **Swagger API documentation:**

   Open `http://localhost:8080/swagger-ui.html` in your web browser to explore and test the API endpoints.

4. **Database Configuration:**

   This project uses MongoDB as the database. Ensure you have MongoDB installed and running locally or provide the appropriate MongoDB connection details in the application properties.

## Usage

- **View All Job Posts:**

  You can retrieve a list of all job posts by making a GET request to `/posts`.

- **Search Job Posts:**

  Search for job posts based on text queries by making a GET request to `/posts/{text}` where `{text}` should be replaced with your search query.

- **Add a New Job Post:**

  Create a new job post by making a POST request to `/post` with a JSON payload containing the job post details.

Example JSON payload for creating a job post:
```json
{
   "profile": "Job Title",
   "desc": "Job Description",
   "exp": 2,
   "techs": ["Java", "Spring Boot"]
}
```

## API Documentation

For detailed API documentation and examples, please refer to the [Swagger UI](http://localhost:8080/swagger-ui.html) when the application is running.

## Contributing

We welcome contributions to this project! If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.

Before contributing, please review our [Contributing Guidelines](CONTRIBUTING.md).

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to customize the README further to include any additional information specific to your project. Make sure to replace placeholders like `your-username` and update URLs as needed.
