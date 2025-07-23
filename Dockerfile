FROM openjdk:17-jdk-slim
# Указываем рабочую директорию внутри контейнера
WORKDIR /app
# Копируем собранный jar-файл внутрь контейнера
COPY target/*.jar app.jar
# Указываем команду запуска
ENTRYPOINT ["java", "-jar", "app.jar"]