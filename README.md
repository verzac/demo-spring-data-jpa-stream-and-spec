# How to run
```
docker run --name postgres-demo -p 5432:5432 -e POSTGRES_PASSWORD=yourSuperSecretPassword -e POSTGRES_USER=postgres -e POSTGRES_DB=postgres -d postgres
./gradlew bootRun
```
