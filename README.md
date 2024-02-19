# Basic Spring JDBC Trainer

Implements an in-memory, HSQLDB database application using different foods as data in Spring using JdbcTemplate and either DataSource/Initializer or EmbeddedDatabaseBuilder to pull single columns from rows.

### Application-Server:
Uses embedded Tomcat server and @AnnotationConfigWebApplicationContext to display food types to the localhost in the browser.

### Spring-Boot:
Lets Spring Boot configure everything with @SpringBootApplication, automatically, to display the food names in the console.

### Embedded-Server:
Uses @AnnotationConfigApplicationContext and the EmbeddedDatabaseBuilder to create an embedded database for displaying the food names in the console.

### Standalone:
Uses @AnnotationConfigApplicationContext to fetch the FoodReportService bean and display food names in the console.
