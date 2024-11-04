FROM openjdk:17-jdk-slim
LABEL authors="Youssef"
# Set the working directory in the container
WORKDIR /app

# Copy the Maven project file to the container
COPY pom.xml .

# Copy the source code to the container
COPY src ./src
COPY mvnw .
COPY .mvn .mvn
RUN ./mvnw dependency:resolve

# Build the application
RUN ./mvnw package -DskipTests

# Expose port 8080 to the outside
EXPOSE 8089

# Set the entry point to run the application
ENTRYPOINT ["java", "-jar", "target/tp-foyer.jar"]
