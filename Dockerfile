FROM amazoncorretto:17
ARG WAR_FILE=target/*.war
COPY ${WAR_FILE} nba.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/nba.jar"]