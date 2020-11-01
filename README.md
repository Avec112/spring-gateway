# Spring Cloud Gateway
Simple Spring Boot application testing the Spring Cloud Gateway functionality.

## Requirements
* Java 15 (or change to no older than Java 8 in pom.xml)
* Maven 3.6+ (older might work)
* Httpie, Curl or Postman 

## Howto
Run these commands from your terminal
* `> mvn clean install`
* `> mvn spring-boot:run` (will start on port 8080) 
* `> http :8080/get`
* `> http :8080/users/1 host:www.cnn.com`
* `> http :8080/headers`