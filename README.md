# How to create a person in Java

This project demonstrates basic object-oriented programming concepts in Java — including class composition, encapsulation, and copy constructors.

The main idea is that the Person class brings everything together by using the Address and MyDate classes to represent a complete person.

# Project structure
```bash
Lektion 9/
└── SRC/
    ├── Address.java
    ├── MyDate.java
    ├── Person.java   ← Calls Address and MyDate
    └── CodeTester.java
```

To run: 
```bash
Lektion 9/SRC/CodeTester.java
```

# Classes Overview
* Address.java

Represents an address with street and city attributes.

Includes a toString() method for readable output.

* MyDate.java

Represents a date with day, month, and year.

Includes methods to:

Calculate the number of days between two dates.

Test equality between two MyDate objects.

* Person.java

The main class that ties everything together.

* Uses:

Address to store where the person lives.

MyDate to store the person’s birthday.

* Includes:

A copy constructor to allow address changes (e.g., moving).

A toString() method to display complete person information.

CodeTester.java

The test class used to create objects from all the other classes and verify that they work together correctly.

