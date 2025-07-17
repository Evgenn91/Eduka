FROM openjdk:17-jdk-slim
# Указываем рабочую директорию внутри контейнера
WORKDIR /app
# Копируем собранный jar-файл внутрь контейнера
COPY target/eduka-0.0.1-SNAPSHOT.jar app.jar
# Указываем команду запуска
ENTRYPOINT ["java", "-jar", "app.jar"]