# Use an official OpenJDK runtime as the base image
FROM openjdk:11-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file into the container
COPY target/calculator.jar /app/calculator.jar

# Command to run the JAR file
CMD ["java", "-jar", "/app/calculator.jar"]
