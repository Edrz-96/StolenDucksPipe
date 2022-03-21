FROM openjdk:11
EXPOSE 9000

COPY ./target/SpringBootStarter-0.0.1-SNAPSHOT /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "my-app-1.0-SNAPSHOT.jar"]
