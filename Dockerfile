FROM openjdk:17-jdk-slim
WORKDIR /app                                     # Указываем рабочую директорию внутри контейнера
COPY target/eduka-0.0.1-SNAPSHOT.jar app.jar     # Копируем собранный jar-файл внутрь контейнера
ENTRYPOINT ["java", "-jar", "app.jar"]           # Указываем команду запуска