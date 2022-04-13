FROM openjdk:11
EXPOSE 8080
WORKDIR /app
COPY src /app/src
COPY pom.xml /app
RUN mvn clean package
ENTRYPOINT ["java","-jar","/docker-container_3.jar"]
