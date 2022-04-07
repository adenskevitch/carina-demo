# syntax=docker/dockerfile:1
FROM maven:3.8.4-openjdk-11-slim
COPY . .
RUN mvn clean install -DskipTests
CMD ["mvn", "test", "-Dsuite=${API_SUITE}"]