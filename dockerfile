FROM openjdk:11-jdk
WORKDIR /app
COPY ./target/MiniProject-1.0-SNAPSHOT.jar app.jar
CMD ["java", "-cp", "app.jar","com/example/demo/App"]



