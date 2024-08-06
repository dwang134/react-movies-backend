# Use the official Gradle image to build the app
FROM gradle:7.5.0-jdk21 AS build
WORKDIR /app
COPY . .
RUN gradle build -x test

# Use the official OpenJDK image to run the app
FROM openjdk:21-jdk-slim
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
