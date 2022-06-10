# Description

## First Step
Run the command below for generate the file .jar: 
```bash
gradle bootjar
```

## Second Step
Run the docker-compose
```bash
docker-compose up
```

## Third Step
Call any endpoint from the documentation [Manga Store Swagger](swagger.yaml)

Ps: you can use Swagger Editor for better viewing - https://editor.swagger.io/

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







