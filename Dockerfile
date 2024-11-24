FROM clojure as build

COPY . /app

WORKDIR /app

RUN lein uberjar

FROM amazoncorretto:11-alpine

WORKDIR /app

COPY --from=build /app/target/migratus-container-0.1.0-SNAPSHOT-standalone.jar  /app/migratus-container.jar

CMD ["java", "-jar", "migratus-container.jar"]
