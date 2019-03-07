FROM openjdk:8u181

ADD ./k8s-java.jar /app.jar

ENTRYPOINT [ "sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]