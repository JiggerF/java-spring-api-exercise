FROM openjdk:16-slim

WORKDIR /opt/microservice

COPY ./build/libs/gs-serving-web-content-0.1.0.jar /opt/microservice/app.jar

EXPOSE 8080

ENTRYPOINT ["sh", "-c", "java -jar /opt/microservice/app.jar"]

USER nobody