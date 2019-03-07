FROM mcr.microsoft.com/java/jdk

ADD ./k8s-java.jar /app.jar

ENTRYPOINT [ "sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]