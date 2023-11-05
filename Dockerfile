# Use OpenJDK 17 as the base image to build the application
FROM openjdk:17-jdk-alpine

# Copy the compiled JAR file from the target directory to the Docker image
COPY target/springboot-mongo-docker.jar app.jar

# Specify the entry point to run the application with JDK 17
ENTRYPOINT ["java", "-jar", "app.jar"]
