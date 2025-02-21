FROM openjdk:11-jdk

# Set the working directory
WORKDIR /app

# Copy the JAR file from target folder to /app inside the container
COPY target/MiniProject-1.0-SNAPSHOT.jar /app/MiniProject-1.0-SNAPSHOT.jar

# Command to run the Java application
CMD ["java", "-jar", "MiniProject-1.0-SNAPSHOT.jar"]

