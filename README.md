# Product API

A simple RESTful API built using Spring Boot for managing products. This API supports CRUD operations to create, read, update, and delete product records.

## Features

- Create a new product  
- Retrieve product details by ID  
- Retrieve all products  
- Update an existing product by ID  
- Delete a product by ID  

## Technologies Used

- Java  
- Spring Boot  
- Maven  
- MySQL (or any relational database)  

## API Endpoints

| Method | Endpoint          | Description                  |
|--------|-------------------|------------------------------|
| POST   | `/prod`           | Create a new product          |
| GET    | `/prod/{id}`      | Get product by ID             |
| GET    | `/prod`           | Get all products              |
| PUT    | `/prod/{id}`      | Update product by ID          |
| DELETE | `/prod/{id}`      | Delete product by ID          |

## How to Run

1. Clone the repository  
2. Import the project into your favorite IDE (like IntelliJ IDEA or Eclipse)  
3. Configure your database connection in `application.properties`  
4. Run the Spring Boot application  
5. Use Postman or any API client to test the endpoints  

---

Feel free to customize this README according to your project specifics. Agar chahiye to main aur detailed version bhi bana sakta hoon, bas bol dena!
