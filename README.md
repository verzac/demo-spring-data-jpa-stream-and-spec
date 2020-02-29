# How to run
```
# optionally, you can set up your Postgres instance yourself and edit src/main/resources/application-local.yml
docker run --name postgres-demo -p 5432:5432 -e POSTGRES_PASSWORD=yourSuperSecretPassword -e POSTGRES_USER=postgres -e POSTGRES_DB=postgres -d postgres

# run the thing!
./gradlew bootRun
```
