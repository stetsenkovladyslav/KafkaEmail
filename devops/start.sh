cd ..
mvn package -DskipTests
cd devops/
docker-compose up -d --force-recreate --build