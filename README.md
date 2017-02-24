# minjpa
repository that contains minimum jpa project based on Hibernate with two classes example 

It uses mysql db with development setup:
username: minjpa
password: minjpa
db_name: minjpa

to start with this docker can be used with the following container:
docker run --name mysql-minjpa -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=minjpa -e MYSQL_USER=minjpa -e MYSQL_PASSWORD=minjpa -p 3306:3306 -d mysql:5.7