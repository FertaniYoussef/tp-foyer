FROM openjdk:8-jdk-alpine
EXPOSE 8089
ADD target/tp-foyer.jar tp-foyer.jar
# Set the entry point to run the application
ENTRYPOINT ["java", "-jar", "target/tp-foyer.jar"]
