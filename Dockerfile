# Stage 1: Build the application
# FROM maven:3.8.6-jdk-11 AS builder
# FROM maven:ms-17.0.15 AS builder
FROM maven:3.8.3-openjdk-17 AS builder
#FROM maven:3.8.3-openjdk-24 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
ADD  target/kpjavaspringboot-0.0.1-SNAPSHOT.jar kpjavaspringboot.jar
#RUN mvn clean install -DskipTests
RUN mvn clean install compile

## Stage 2: Create the runtime image
FROM maven:3.8.3-openjdk-17
# FROM maven:3.8.3-openjdk-24
LABEL maintainer="KPJavaSpringBootApplication"
#ADD  target/KPJavaSpringBoot-3.3.4.jar kpjavaspringboot.jar
#COPY --from=builder application/dependencies/ ./
#COPY --from=builder application/spring-boot-loader/ ./
#COPY --from=builder application/snapshot-dependencies/ ./
#COPY --from=builder application/application/ ./
ADD  target/kpjavaspringboot-0.0.1-SNAPSHOT.jar kpjavaspringboot.jar
ENTRYPOINT ["java", "-jar", "kpjavaspringboot.jar"]


## Stage 2: Create the runtime image
#FROM openjdk:8-jdk-alpine
#ARG JAR_FILE=test-*.jar
#COPY ${JAR_FILE} test.jar
#ENTRYPOINT ["java", "-jar", "test.jar"]
#
#FROM maven:3.8.3-openjdk-17
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} kpjavaspringboot.jar
#ENTRYPOINT ["java", "-jar", "kpjavaspringboot.jar"]

#FROM maven:3.8.3-openjdk-17
#WORKDIR /app
#COPY --from=builder /app/target/classes ./
#EXPOSE 8181
###CMD ["java", "org.springframework.boot.loader.JarLauncher"]
###CMD ["java", "com.mycompany.project.MyApplication"]
###CMD ["java", "com.kpjavaspringboot.KPJavaSpringBootApplication"]
###CMD ["java", "KPJavaSpringBootApplication"]
###CMD ["java", "com.kpjavaspringboot.KPJavaSpringBootApplication.class"]
###ENTRYPOINT ["java", "com.kpjavaspringboot.KPJavaSpringBootApplication.class"]
#ENTRYPOINT ["/app/target/classes", "KPJavaSpringBootApplication.class"]

