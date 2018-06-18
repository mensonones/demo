# demo
Repositório de um simples projeto para gerar uma imagem docker do mesmo. 

##Plugin Spotify
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
...esse comando apaga a pasta target e gera u novo build da aplicação. 
2. dockerfile:build
...Cria a imagem da aplicação com o nome definido no plugin dockerfile-maven-plugin no pom.xml

```xml
<configuration>
			<repository>demo/${project.artifactId}-app</repository>
		</configuration>
```
e instala no docker local, assim sendo visível quando executado o comando docker images.

###Docker(Executar Docker - Terminal)

1. docker images
...lista as imagens do docker local
2.  docker run -p 8080:8080 demo/demo-app
... esse comando executa o container da aplicação 
