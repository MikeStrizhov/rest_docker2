FROM openjdk:8
ADD target/rest-docker.jar rest-docker.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "rest-docker.jar"]