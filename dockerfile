FROM openjdk:17-jdk
WORKDIR /app

# Copy the JAR file from the target directory to /app inside the container
COPY target/MiniProject-1.0-SNAPSHOT.jar app.jar

# Run the Java application
CMD ["java", "-cp", "app.jar", "com.example.demo.App"]

