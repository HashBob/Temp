FROM openjdk
LABEL maintainer = "abc@mail.com"
EXPOSE 8090
WORKDIR /app
COPY target/classes/org/example/Main.class /app/Main.class
ENTRYPOINT ["java"," Main.class"]