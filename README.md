# Build a Rest API:

## Environment Setup:

* Using Eclipse IDE and Java Version 17 and Spring Initializr to create the initial setup.

* Building Hello World API with Spring Boot:

```
    // http://localhost:8080/courses
    [
    {
     "id": 1,
     "name": "Learn AWS",
     "author": "noone"
    }]



```


* Java spring boot app goal is to help us to build production ready apps quickly.

### Build Quickly:
 * Spring Initialzr
 * Spring Boot Starter Projects
 * Spring Boot Auto Configuration
 * Spring Boot DevTools


###  <b> Be Production Ready </b>
* Logging
* Different Configuration for Different Environments: (Profiles, ConfigurationProperties)
* Monitoring(Spring Boot Actuator)


# Spring Boot Starter Projects

* I need to build application features:
 * Build a REST API For example: 
   * Spring;
   * Spring MVC;
   * Tomcat;
   * JSON Conversion;
  
 * Write Unit Tests:
   * Spring Test;
   * JUnit;
   * Mockito;

###  How can I group them and make it easier to build apps?

 * <b>Starter</b>: Convenient <b>dependency descriptors</b> for diff.features (pom.xml)

### Spring Boot provides variety of starter Projects:

 * <b>Web Application & REST API</b>:
   * Spring Boot Starter Web:
     * spring-webmvc;
     * spring-web;
     * spring-boot-starter-tomcat;
     * spring-boot-starter-json;
 * <b>Unit Tests</b>:
  * Spring Boot starter Tests;

* <b>Talk to database using JPA</b>:
 * Spring Boot starter data JPA;

* <b>Talk to database using JDBC</b>:
 * Spring Boot starter JDBC;

* <b>Secure web application or REST API</b>:

 * Spring Boot starter Security

# Spring Boot Auto Configuration:

* Configuration building Spring App:
 * Component Scan, 
 * DispatcherServlet, 
 * Data Sources, 
 * JSON Conversion

* <b>How can I simplify this?</b>
  * Auto configuration: Automated configuration for app:

    * Which frameworks are in the Class Path?
    * What is existing configuration (Annotations etc)?


# Spring Boot DevTools:














 