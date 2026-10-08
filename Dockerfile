#imagem apline
FROM eclipse-temurin:17-jdk-alpine

#diretorio
WORKDIR /app

#copiar o que esta no meu pc para dentro do container
COPY src/Main.java /app/

#compile o arquivo java
RUN javac Main.java

#execute o aplicativo
CMD ["java", "Main"]
