# jee-architecture-spring-boot-domain
Microservice Architecture, using Spring Boot/Cloud and Domain layer

## Requirements

- JDK 1.8
- Apache Maven 3.x

## Stack

- JSE 8
- Spring Boot 1.x
- Spring Boot Actuator 1.x
- Spring Boot Undertow 1.x
- Spring Boot Starter Security 1.x
- Spring Cloud Starter Eureka 1.x
- Spring Cloud Starter Zuul 1.x
- Spring Cloud Starter Config 1.x
- Spring Cloud Starter Hystrix 1.x
- Spring Boot MyBatis 1.x
- Spring Data JPA 2.x
- Spring Data Mongo 2.x
- Spring Data Redis 2.x
- Spring Data Neo4J 5.x
- AspectJ
- Lombok

## Contribution guide

### Remotes

The **remotes** follow the convention:

- _**origin**_: fork in the account of the developer

- _**upstream**_: main repository

### Building

For development environment:

```sh
$ mvn clean spring-boot:run -P dv
```

For staging environment:

```sh
$ mvn clean spring-boot:run -P st
```

For production environment:

```sh
$ mvn clean spring-boot:run -P pd
```

## License

MIT

**Free Software, Hell Yeah!**
