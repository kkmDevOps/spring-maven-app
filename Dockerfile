FROM adoptopenjdk/openjdk11:alpine-jre


WORKDIR /app


COPY target/*.jar app.jar

EXPOSE 8080


CMD ["java", "-jar", "app.jar"]
