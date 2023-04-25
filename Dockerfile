
FROM amazoncorretto:17-alpine-jdk

MAINTAINER emaaristiuno

COPY target/ArgProg-0.0.1-SNAPSHOT.jar ArgProg-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/ArgProg-0.0.1-SNAPSHOT.jar"]