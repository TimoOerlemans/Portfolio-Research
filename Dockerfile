FROM openjdk:11
EXPOSE 8080
ADD target/BackendProduct-0.0.1-SNAPSHOT.jar BackendProduct-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/BackendProduct-0.0.1-SNAPSHOT.jar"] 
