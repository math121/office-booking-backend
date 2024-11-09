# OfficeBook - Backend

A simple office booking system where users can book or register office spaces.

## NB
The login and signup functionalties are mocked. The password is exposed on the request url.  
A proper authentication system will be set up later.

## Prerequisites
- Java
- [Apache Maven](https://maven.apache.org/download.cgi)
- [Docker Desktop](https://nodejs.org/en/download/package-manager)

Run the frontend: https://github.com/math121/office-booking-frontend

## Clone project
Use the terminal to clone the project
```bash
git clone https://github.com/math121/office-booking-backend.git
```

## .env file
Add a new file to the root of the project and name it .env  
Add the following to the file, replacing the ? with a username and password of your choice
> DB_USERNAME=?  
> DB_PASSWORD=?


## Install dependencies
cd into the project, and install the dependencies using maven:
```bash
cd office-booking-backend
mvn install
```

## Run docker
Run the following command to build, create and start the docker container in detached mode
```bash
docker compose up -d
```

## Run the backend locally
```bash
mvn spring-boot:run 
```

## Author
[Mathangi Pushparajah](https://github.com/math121)