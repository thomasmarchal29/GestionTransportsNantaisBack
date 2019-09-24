# GestionTransportsNantais

This is an application geared to the employees of the company running the public transports of the city of Nantes, France. Administrators of the site can add employees, either drivers or technicians, and public transports, either buses or tramways, to the database. Then, they can assign missions to these employees, based on their capabilities. As such, drivers can be appointed to driving a determined public transport on a determined line and on determined day and time. Technicians can be given the maintenance of a vehicle, on their own or as a team of several technicians, on a determined day.

Each employee can access a list of all driving jobs and maintenances assigned to the entirety of the staff on their welcome page. From there, they can also visit a personal page displaying only their own missions or maintenances.

Another feature of the application is the possibility, for each employee, to post requests for holidays. Administrators, only, can see all the requests made by the employees on a dedicated page and modify their status so as to either accept or refuse them.

In the end, this application is a means of organizing the tasks of the company and displaying them in a simple, user-friendly and efficient way. The holiday requests are also greatly simplified as they can be completed in just a few clicks.

This repository contains the backend part of the application.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

To install and run this project you need as requirements:

Java JDK and JRE - Java 8 or higher version
Maven - Maven 2 or higher version
Eclipse - 2019-09 R (4.13.0) version
XAMPP - v3.4.2 or any other database management system

### Setting up

To download the project, clone it from github using the next command:

$ git clone https://github.com/thomasmarchal29/GestionTransportsNantais.git

## Running the tests

Navigate to the project directory and use the next command:

$ mvn test

## Installing

To install the project use the next command:
$ mvn install

## Running

To run the project use the next command:
$ mvn spring-boot:run

## Technologies

Java EE - The web framework used
Spring Boot - The framework used for Microservice Architecture
Spring Data JPA - The framework used in the persistence Layer
Spring WebService - The framework used in the Rest Controller Layer
Maven - Dependency Management

## Authors

Fouillet Cédric - Initial work - CedricNF
Marchal Thomas - Initial work - thomasmarchal29

## License

This project is licensed under the MIT License.
