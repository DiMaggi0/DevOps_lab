FROM openjdk:22-slim as build
WORKDIR /app
COPY target/DevOps_lab-1.0-SNAPSHOT.jar DevOps_lab-1.0-SNAPSHOT.jar
CMD java -jar DevOps_lab-1.0-SNAPSHOT.jar

FROM maven
RUN mvn clean install
#COPY --from=build target/DevOps_lab-1.0-SNAPSHOT.jar DevOps_lab-1.0-SNAPSHOT.jar



