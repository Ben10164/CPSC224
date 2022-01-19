FROM openjdk:11
WORKDIR /app
COPY . .
RUN	apt update
RUN	apt install -y maven python3-pip checkstyle
RUN ls -A1 | xargs rm -rf
