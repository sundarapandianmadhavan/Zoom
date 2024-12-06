# Use the correct OpenJDK base image
FROM openjdk:8u151-jdk-alpine3.7

# Expose port 8080 to allow external access to the application
EXPOSE 8080

# Set the working directory for the application
WORKDIR /usr/src/app

# Copy the application JAR file into the container
COPY memoryref/target/memoryref.jar app.jar

# Use ENTRYPOINT to run the JAR file as the container's main process
ENTRYPOINT ["java", "-jar", "app.jar"]
