FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY build/libs/my-springboot-app.jar /app/app.jar
//ADD "build/libs/my-springboot-app.jar" "/app.jar"
//ADD "/build/newrelic/newrelic.jar"  "/opt/newrelic/newrelic.jar"
ADD "run.sh"  "/"

RUN chmod +x "/opt/newrelic/newrelic.jar"

//ADD
ADD "run.sh"  "/"
RUN chmod +x "/run.sh"
RUN mkdir -p  /opt/newrelic/logs
RUN chown -R root:root /opt/newrelic/logs

ENTRYPOINT["/run.sh"]