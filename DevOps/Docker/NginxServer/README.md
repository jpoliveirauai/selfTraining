# MySQL serve setting with docker

```bash
docker run -d --network host --name  Nginx -v /site:/usr/share/nginx/html  nginx
#Running the container with the Mysql name

docker exec -it Mysql bash
#executes the bash inside the container
```
