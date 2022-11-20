FROM amazoncorretto:11

ARG JAR_FILE=./build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENV TZ=Asiz/Seoul

ENTRYPOINT ["java", "-jar", "app.jar"]
