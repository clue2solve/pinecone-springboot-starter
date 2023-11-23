# Pinecone Spring Boot Starter

This is a Spring Boot Starter for Pinecone, which simplifies the configuration of Pinecone in a Spring Boot application.

This Starter uses the [pinecone-java-client](https://github.com/clue2solve/pinecone-java-client) and provides you an easy way to configure and inject the clients as described below. 


## Getting Started

### Add the Starter to Your Project

Add the following dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>io.clue2solve</groupId>
    <artifactId>pinecone-springboot-starter</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Configure Your Application
Add the following properties to your `application.properties` or `application.yml`:

```properties
pinecone.db.environment=your-environment
pinecone.db.projectId=your-project-id
pinecone.db.apiKey=your-api-key
```

### Usage
Once you've added the starter and configured your application, you can `@Autowire` the `PineconeDBClient` and `PineconeIndexClient` in your application:

```Java
@Autowired
private PineconeDBClient pineconeDBClient;

@Autowired
private PineconeIndexClient pineconeIndexClient;
```

### License
This project is licensed under the MIT License.



You can customize this template to better fit your project. Make sure to replace your-environment, your-project-id, and your-api-key with appropriate instructions for your users.


