# Cake Bakery Application

## Homework Problem Statement

### Alice and her Bakery

* Create a class called `CakeBaker`, that is dependent on two other classes called `Frosting` and `Syrup`.
* This class has a function called `bakeCake()`.
* Create two interfaces of type `Frosting` and `Syrup` with functions called `getFrostingType()` and `getSyrupType()` respectively.
* Create two implementations of these two interfaces (total 4 classes) for Chocolate and Strawberry flavors.
* Use Dependency Injection to inject the `Frosting` and `Syrup` dependencies into the `CakeBaker` class.
* Call the `bakeCake()` function from the `CakeBaker` class.

---

A simple Spring Boot project demonstrating:

* Dependency Injection
* Constructor Injection
* Interfaces in Java
* Spring Beans
* `application.properties` configuration
* Basic Spring Boot project structure

---

# Tech Stack

* Java
* Spring Boot
* Maven
* IntelliJ IDEA

---

# Project Structure

```text
src
 └── main
      ├── java
      │    └── org.premanshuray.cakebakeryapplication
      │          ├── CakeBaker.java
      │          ├── Frosting.java
      │          ├── Syrup.java
      │          └── CakebakeryApplication.java
      │
      └── resources
           └── application.properties
```

---

# Features

* Uses Spring Boot Dependency Injection
* Reads cake configuration from `application.properties`
* Demonstrates loose coupling using interfaces
* Customizable frosting and syrup types

---

# application.properties

```properties
cake.frostingType=strawberry
cake.syrupType=chocolate
server.port=8080
```

---

# Example Output

```text
Strawberry Frosting
Chocolate Syrup
```

---

# How to Run

## Clone Repository

```bash
git clone https://github.com/Prem-Ray/cakebakeryapplication.git
```

## Open Project

Open the project in IntelliJ IDEA.

## Run Application

Run:

```text
CakebakeryApplication.java
```

or use Maven:

```bash
mvn spring-boot:run
```

---

# Learning Concepts Covered

## Spring Boot

* `@Component`
* `@Value`
* Constructor Injection
* Bean Management
* `application.properties`

## Java

* Interfaces
* OOP Concepts
* Loose Coupling
* Classes and Objects

---

# Git Commands Used

```bash
git init
git add .
git commit -m "Initial commit"
git push -u origin main
```

---

# Author

Premanshu Ray

GitHub: [https://github.com/Prem-Ray](https://github.com/Prem-Ray)
