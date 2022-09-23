FROM nginx:latest


LABEL version="0.0.1"

EXPOSE 80

WORKDIR /usr/share/nginx/html
COPY index.html index.html

COPY style.css style.css
COPY 1.jfif 1.jfif
COPY 4.jfif 4.jfif
COPY ayush.jpg ayush.jpg
COPY ayushishu.png ayushishu.png