# Imagen base de Java 21 con Temurin
FROM eclipse-temurin:21-jdk

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiamos el archivo .jar (asegurate de hacer mvn package antes)
COPY target/*.jar app.jar

# Puerto que exponés
EXPOSE 8080

# Comando para ejecutar la app
ENTRYPOINT ["java", "-jar", "app.jar"]
