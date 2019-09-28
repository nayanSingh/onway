FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG DEPENDENCY=target

ENTRYPOINT ["java","-cp","app:/*","com.cab.onway.OnwayApplication"]