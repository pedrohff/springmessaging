FROM maven:3.8.5-openjdk-17 AS builder
WORKDIR /app

COPY src /app/src
COPY pom.xml /app/pom.xml

RUN mvn clean package

FROM openjdk:17

COPY --from=builder /app/target/helloworld-0.0.1-SNAPSHOT.jar /app/messaging.jar

RUN chmod +x /app/messaging.jar
EXPOSE 8000

COPY src/main/resources/application.docker.yaml /app/application.yaml
ENV SPRING_CONFIG_LOCATION=/app/application.yaml
ENTRYPOINT ["java","-jar","/app/messaging.jar", "--spring.config.location=file:///app/application.yaml"]
#RUN chmod +x /app/target/helloworld-0.0.1-SNAPSHOT.jar
#ENTRYPOINT ["/app/target/helloworld-0.0.1-SNAPSHOT.jar"]