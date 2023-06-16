FROM openjdk:22-slim
WORKDIR /app
COPY target/DevOps_lab-1.0-SNAPSHOT.jar DevOps_lab-1.0-SNAPSHOT.jar
CMD java -jar DevOps_lab-1.0-SNAPSHOT.jar





