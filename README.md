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

* EXAMPLE: Spring Boot Web:
   * Dispatcher Servlet(DispatchServletAutoConfiguration)
   * Embedded Servlet Container : Tomcat is default (EmbeddedWebServerFactoryCustomizeAutoConfiguration)
   * Default Error Pages(ErrorMvcAutoConfiguration)
   * Bean<>JSON(JacksonHttpMessageConvertersConfiguration)

# Spring Boot DevTools:

 * Increase Developer Productivity
 * Why do you need to restart the server manually for every code change?
 * Remember: For pom.xml dependency changes, you will need to restart server manually.


# Managing App. Configuration using Profiles:

 * Applications have different environments: Dev, QA, Stage, Prod, ....
 * Different environments need different configuration: 
   * Different Databases
   * Different Web Services
 * How can you provide different configuration for different environments?
   * Profiles: Environment specific configuration:
    * trace
    * debug
    * info
    * warning
    * error
    * off

# Managing App. Configuration using Configuration Properties:


# Managing App. Configuration using Embedded Servers:

# Managing App. Configuration using Actuator:

# Understanding Spring Boot vs Spring Boot vs Spring MVC:

 * Spring Boot vs Spring MVC vs Spring:
   * <b>Spring framework:</b> Dependency Injection
     * @Component, @Autowired, Component Scan etc...
     * Just Dependency Injection is NOT sufficient (You need other frameworks to build apps)
       * Spring Modules and Spring Projects: Extend Spring Eco SYstem
         * Provide good integration with other frameworks(Hibernate/JPA, JUnit & Mockito for unit testing)
    * <b>Spring MVC:(Spring Module):</b> Simplify building web apps and REST API
      * Building web applications with Struts was very complex.
      * @Controller, @RestController, @RequestMapping("/courses")

    * <b>Spring Boot:(Spring Project):</b> Build PRODUCTION-READY apps QUICKLY.
      * Starter Projects: Make it easy to build variety of applications
      * Auto Configuration: Eliminate configuration to setup Spring, Spring MVC and other frameworks.
      * <b>Enable non functional Requirements(NFRs):</b>
        * ACTUATOR: Enables Advanced Monitoring of Applications
        * EMBEDDED SERVER: No need for seperate application servers.
        * Logging and error handling.
        * Profiles and Configuration Properties.





 