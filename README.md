# Hello World Spring Boot REST API

A simple Spring Boot REST API with two endpoints.

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

## Endpoints

- `GET /hello` - Returns "hello-world"
- `GET /square?number=x` - Returns the square of the given number

## How to compile

```bash
mvn clean compile
```

## How to run

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## How to test

Run all tests:
```bash
mvn test
```

## Example requests

```bash
# Get hello world message
curl http://localhost:8080/hello

# Get square of a number
curl "http://localhost:8080/square?number=5"
```