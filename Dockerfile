FROM java:8-alpine
ADD test-jenkins-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 10010
ENTRYPOINT ["java","-jar","/app.jar"]