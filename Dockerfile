FROM ubuntu:20.04
RUN mkdir -p /u01/applications
RUN apt update -y
RUN apt install -y openjdk-11-jdk
WORKDIR /u01/applications
COPY target/roadster-1.0.jar .
CMD ["java", "-jar", "roadster-1.0.jar"]