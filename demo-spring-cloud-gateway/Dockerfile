FROM java:8
VOLUME /tmp
ADD target/demo-spring-cloud-gateway.jar /app.jar
EXPOSE 8181
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]