# Description
You need to use Java 11 for this project. You can install java and gradle using SDK manager.

https://sdkman.io/

## First Step
Run the command below for generate the file .jar: 
```bash
gradle bootjar
```
or
```bash
./gradlew bootjar
```

## Second Step
Run the docker-compose (you need install docker-compose if you don't have yet)
```bash
docker-compose up
```

## Third Step
Call any endpoint from the documentation [Manga Store Swagger](http://localhost:8080/swagger-ui.html)


## Fourth Step
To see the data on Database access:
```text
http://localhost:8081
```
Use:
```text
Username: admin
Password: manga
```
## Fifth Step
To stop the docker-compose use:
```bash
docker-compose down
```

Thanks!






