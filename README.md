A demo on how you can implement your own repository fragment which enables you to use Streams with JPA Specification in Spring Data JPA.

Also comes with seed data which seeds your DB with 500k records in the `customer` table.

Medium article: https://medium.com/@benjamin.tanone/scrolling-through-large-datasets-in-spring-data-jpa-with-streams-and-specification-2fd975129758

# How to run
```
# optionally, you can set up your Postgres instance yourself and edit src/main/resources/application-local.yml
docker run --name postgres-demo -p 5432:5432 -e POSTGRES_PASSWORD=yourSuperSecretPassword -e POSTGRES_USER=postgres -e POSTGRES_DB=postgres -d postgres

# run the thing!
./gradlew bootRun
```
