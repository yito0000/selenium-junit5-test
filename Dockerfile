FROM openjdk:8-jdk-alpine
RUN apk update && apk add bash
COPY . .
CMD bash -c "java -jar build/libs/selenium-junit5-test-0.0.1-SNAPSHOT.jar"