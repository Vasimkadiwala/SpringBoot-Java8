FROM java:8
VOLUME /tmp
ADD /target/demo-amazon-0.0.1-SNAPSHOT.jar  demo-amazon.jar
RUN bash -c 'touch /demo-amazon.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo-amazon.jar"]