## Stage 1: Build the application
FROM maven:3.8.3-openjdk-17 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
ADD  target/kpjavaspringboot-0.0.1-SNAPSHOT.jar kpjavaspringboot.jar
RUN mvn clean install compile

## Stage 2: Create the runtime image
FROM maven:3.8.3-openjdk-17
LABEL maintainer="KPJavaSpringBootApplication"
ADD  target/kpjavaspringboot-0.0.1-SNAPSHOT.jar kpjavaspringboot.jar
ENTRYPOINT ["java", "-jar", "kpjavaspringboot.jar"]


