# Job-Listing BACKEND APIs (Endpoints)

![joblisting](https://github.com/JoseSagwe/Job-Listing-Spring-Project/assets/110198843/0c3f6aae-2ccb-41f7-88f5-075721c0763c)


# Job Listing Project


## Overview

This is a job listing project built with Spring Boot and MongoDB, allowing you to create and search job posts. It includes RESTful APIs for managing job posts and a search feature based on text queries.

## API Endpoints
- **Get All Job Posts**

  - **URL:** `/posts`
  - **Method:** GET
  - **Description:** Retrieve a list of all job posts.


- **Search Job Posts by Text**
  - **URL:** `/posts/{text}`
  - **Method:** GET
  - **Description:** Search for job posts based on text queries.


  - **Example:**
    ```
    GET /posts/java
    ```
    This will search for job posts containing the word "java" in their descriptions, profiles, or technologies.

- **Add a New Job Post**
  - **URL:** `/post`
  - **Method:** POST
  - **Description:** Create a new job post.

  - **Request Body Example:**
    ```json
    {
       "profile": "Job Title",
       "desc": "Job Description",
       "exp": 2,
       "techs": ["Java", "Spring Boot"]
    }
    ```
 
    
    This will create a new job post with the specified details.

## Installation

1. **Clone the repository:**

2. **Build and run the project:**

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
