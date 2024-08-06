# Use the official OpenJDK image to build the app
FROM openjdk:21-jdk-slim AS build
WORKDIR /app

# Install Gradle
RUN apt-get update && apt-get install -y wget unzip && \
    wget https://services.gradle.org/distributions/gradle-7.5.1-bin.zip && \
    unzip gradle-7.5.1-bin.zip && \
    mv gradle-7.5.1 /opt/gradle && \
    ln -s /opt/gradle/bin/gradle /usr/bin/gradle && \
    rm gradle-7.5.1-bin.zip

# Copy the project files and build the application
COPY . .
RUN gradle build -x test

# Use the official OpenJDK image to run the app
FROM openjdk:21-jdk-slim
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
