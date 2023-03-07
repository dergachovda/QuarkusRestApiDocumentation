# QuarkusRestApiDocumentation
This project shows how to add [OpenAPI](https://oai.github.io/Documentation/start-here.html) specification for [Quarkus](https://quarkus.io/) and how to render it with different approaches like [ReDoc](https://redocly.com/redoc/) and [Swagger UI](https://swagger.io/tools/swagger-ui/).

## SmallRye OpenAPI (https://github.com/smallrye/smallrye-open-api)
### https://quarkus.io/guides/openapi-swaggerui
This guide explains how your Quarkus application can expose its API description through an OpenAPI specification and how you can test it via a user-friendly UI named Swagger UI.

This approach implemented in `main` branch.

SmallRye already includes Swagger UI for dev mode by default(provide possibility to turn on it for all modes: `quarkus.swagger-ui.always-include=true`)
- http://localhost:8080/q/openapi
- http://localhost:8080/q/swagger-ui/

## ReDoc and Swagger UI as separate services
This approach implemented in `redoc` branch.

In this case, SmallRye still generates OpenAPI specification but to render it we can use separate solutions.

### ReDoc as a Docker container
- http://localhost:8081/

### Swagger UI as a Docker container
- http://localhost:8082/
