FROM java:8
EXPOSE 8083
ARG JAR_FILE=target/personal-details-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} personal-details-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","personal-details-0.0.1-SNAPSHOT.jar"]