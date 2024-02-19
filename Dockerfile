
FROM openjdk:11

#open jdk 17 is loaded

EXPOSE 9091

ADD target/munero-docker.jar munero-docker.jar

ENTRYPOINT ["java", "-jar", "/munero-docker.jar"]