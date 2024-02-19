
FROM openjdk:17

#open jdk 17 is loaded

EXPOSE 9091

COPY target/munero.jar munero.jar
#COPY target/*.jar /munero-docker.jar

ENTRYPOINT ["java", "-jar", "/munero.jar"]