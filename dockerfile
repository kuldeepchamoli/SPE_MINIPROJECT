FROM openjdk:17-jdk
WORKDIR /app
COPY ./SPE_MINIPROJECT/demo/target/MiniProject-1.0-SNAPSHOT.jar app.jar
CMD ["java", "-cp", "app.jar","com/example/demo/App"]



