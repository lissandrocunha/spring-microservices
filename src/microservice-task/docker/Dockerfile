# Alpine Linux com OpenJDK 16 JRE 
FROM azul/zulu-openjdk-alpine:16

# Copiar o pacote .jar e renomear para echo.war
COPY task-0.0.1-SNAPSHOT.jar /echo.war

# Executar a aplicação
CMD ["/usr/bin/java", "-jar", "/echo.war"]