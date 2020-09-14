FROM openjdk
EXPOSE 8080
ADD target/*.jar api.jar
ENTRYPOINT ["sh", "-c", "java -jar /api.jar"]