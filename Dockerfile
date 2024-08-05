# Use Maven to build the application
FROM maven:3.8.6-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

# Use a compatible OpenJDK image to run the application
FROM amazoncorretto:17-alpine3.17
COPY --from=build /target/shopapp-0.0.1-SNAPSHOT.jar luanvan.jar
EXPOSE 8088
ENTRYPOINT ["java","-jar","luanvan.jar"]
