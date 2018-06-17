FROM java:8
MAINTAINER Emerson Vieira <mensones.1@gmail.com>
ADD target/demo-0.0.1-SNAPSHOT.jar //
ENTRYPOINT ["java", "-jar", "/demo-0.0.1-SNAPSHOT.jar"]
