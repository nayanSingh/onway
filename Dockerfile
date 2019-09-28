FROM openjdk:8-jdk-alpine
WORKDIR /onway
VOLUME /tmp
ARG DEPENDENCY=target

ENTRYPOINT ["java","-cp","app:src/*","com.cab.onway.OnwayApplication"]