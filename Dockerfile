FROM java:8
EXPOSE 8083
ARG JAR_FILE=build/libs/PersonalService-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} PersonalService-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","PersonalService-0.0.1-SNAPSHOT.jar"]