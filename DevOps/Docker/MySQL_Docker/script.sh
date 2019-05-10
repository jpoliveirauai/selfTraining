docker run -d --name Mysql --network host -e MYSQL_ROOT_PASSWORD=123456 mysql;
docker exec -it Mysql bash;

#After get into the container
mysql -u root -p;
CREATE USER user IDENTIFIED BY '123456';
create database Neppo;
GRANT ALL PRIVILEGES ON Neppo.* TO user;