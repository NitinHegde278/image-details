FROM openjdk
EXPOSE 9090
ADD target/*.jar api.jar
ENTRYPOINT ["sh", "-c", "java -jar /api.jar"]