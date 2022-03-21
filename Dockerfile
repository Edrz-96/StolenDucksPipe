FROM openjdk:11


ADD /target/SpringBootStarter-0.0.1-SNAPSHOT  SpringBootStarter.jar
EXPOSE 9000
ENTRYPOINT ["java","-jar", "SpringBootStarter.jar"]
