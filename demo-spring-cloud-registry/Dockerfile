FROM java:8
VOLUME /tmp
ADD target/demo-spring-cloud-registry.jar /app.jar
EXPOSE 9000
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]