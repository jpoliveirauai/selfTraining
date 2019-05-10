# MySQL serve setting with docker

Creating and pulling the official mysql image and creating the user "user" with the password '123456', and mapping the container port to 127.0.0.1:3306
```bash
docker run -d --name Mysql --network host -e MYSQL_ROOT_PASSWORD=123456 mysql
#Running the container with the Mysql name

docker exec -it Mysql bash
#executes the bash inside the container
```
Now, inside the container:

```SQL
#entering in mysql
mysql -u root -p

#Creating an user called user with password 123456
CREATE USER user IDENTIFIED BY '123456';

#creating database neppo
create database Neppo;

#Grant all privileges in database Neppo to user in any host
GRANT ALL PRIVILEGES ON Neppo.* TO user;
```

With those commands, we can acess a database in ```127.0.0.1:3306``` whit the user ```user```