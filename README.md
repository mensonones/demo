# demo
Repositório de um simples projeto para gerar uma imagem docker do mesmo. 

## Dockerfile

FROM java:8  <br/>
MAINTAINER Emerson Vieira <mensones.1@gmail.com>  <br/>
ADD target/demo-0.0.1-SNAPSHOT.jar //  <br/>
ENTRYPOINT ["java", "-jar", "/demo-0.0.1-SNAPSHOT.jar"] 

1. FROM 
* Esse comando refere-se a imagem base na qual a aplicação irá rodar. No exemplo temos o java:8, essa imagem trata-se de um Ubuntu 14.04 com o JDK versão 8, disponibilizado pelo OpenJDK.
2. MAINTAINER 
* Esse comando refere-se ao mantenedor da imagem. 
3. ADD 
* Adiciona o artefato da aplicação para ser executado. 
4. ENTRYPOINT
* Comando para executar o artefato adicionado dentro da imagem. 

## Plugin Spotify
```xml
<plugin>
  <groupId>com.spotify</groupId>
  <artifactId>dockerfile-maven-plugin</artifactId>
  <configuration>
   <repository>demo/${project.artifactId}-app</repository>
  </configuration>
</plugin>
```
Para gerar o artefato e a imagem docker da aplicação, use o comando: mvn clean package dockerfile:build

1. mvn clean package 
* Esse comando apaga a pasta target e gera um novo build da aplicação
2. dockerfile:build 
* Cria a imagem da aplicação com o nome definido no plugin dockerfile-maven-plugin no pom.xml e instala no docker local, assim sendo visível quando executado o comando docker images

```xml
<configuration>
  <repository>demo/${project.artifactId}-app</repository>
</configuration>
```
### Docker(Executar Docker - Terminal)

1. docker images 
* Lista as imagens do docker local)
2. docker run -p 8080:8080 demo/demo-app 
* Esse comando executa o container da aplicação
