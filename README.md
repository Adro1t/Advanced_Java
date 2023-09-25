# Java Programs Repository

Welcome to the Java Programs Repository! This repository contains a collection of both basic and advanced Java programs to help you learn and practice Java programming.

## Introduction

Java is a versatile and widely-used programming language known for its portability and versatility. This repository is designed to assist both beginners and experienced Java developers in honing their skills by providing a variety of Java programs.

## Pre-requirements
To run a Java file, you need to ensure that you have the following prerequisites in place:

1. **Java Development Kit (JDK)**: You must have the Java Development Kit (JDK) installed on your computer. The JDK includes the Java Runtime Environment (JRE) and tools required for compiling and running Java programs. You can download the latest JDK from the official Oracle website or choose an open-source alternative like OpenJDK.

2. **Java Compiler (javac)**: The JDK installation should include the `javac` command, which is the Java compiler. This tool is used to compile Java source code (`.java` files) into bytecode (`.class` files) that can be executed by the Java Virtual Machine (JVM).

3. **Java Runtime Environment (JRE)**: The JRE is responsible for executing Java applications. It should also be included with your JDK installation. You don't need to explicitly install the JRE separately.

4. **Java Development Environment**: You can use any text editor or integrated development environment (IDE) to write and edit your Java code. Popular Java IDEs include Eclipse, IntelliJ IDEA, and NetBeans. Alternatively, you can use a simple text editor like Notepad (on Windows) or any code editor (e.g., Visual Studio Code) on other platforms.

5. **Setting PATH Environment Variable (Optional)**: To run Java and `javac` from the command line without specifying the full path, you may want to add the JDK's `bin` directory to your system's PATH environment variable. This step is optional but can make it more convenient to work with Java from the command line.

6. **Command Prompt or Terminal**: You will need a command prompt (Windows) or terminal (Linux/macOS) to execute Java commands and run your Java programs.

7. **Internet Connection (Optional for Installation)**: If you need to download and install the JDK, you'll need an internet connection to access the official download sources.

## Usage
Compile the program:

```
javac file_name.java
```
Run the program with one or more words as arguments:
```
java file_name input
```

## Programs included

### TestJDK
TestJDK, counts and displays the number of words provided as command-line arguments. It uses Java's basic features such as command-line argument handling, loops, variables, and console output to achieve this. The program calculates the word count, prints it twice along with the individual words, and demonstrates both traditional and for-each loops in Java.

### Sorting
Sorting uses the Bubble Sort algorithm to sort an array of integers in ascending order. It defines a sorting method for this purpose and then demonstrates the sorting process in the main method by sorting an array of numbers and printing the sorted result.

### Class Concept
ClassConcept showcases two types of variables within a class:<br>

Instance Variable: data is an instance variable, specific to each object (instance) of the class.<br>

Static Variable: a is a static variable, shared among all instances of the class and can be accessed without creating objects.

The program's main method does the following:

1. Creates an object obj of the ClassConcept class.

2. Calls the display method to print the value of the static variable a.

3. Prints the instance variable data of obj.

4. Prints the static variable a using the class name.

5. Creates another object obj1 of the ClassConcept class.

6. Prints the instance variable data of obj1.

7. Prints the static variable a of obj1 using the class name.

In summary, this program illustrates the distinction between instance and static variables and demonstrates how to access them within a class.

### Rectangle

Rectangle demonstrates the use of constructors and constructor overloading to create objects representing rectangles. It calculates the area and volume of these rectangles.

1. Instance Variables: The class Rectangle has three instance variables: length, breadth, and height.

2. Constructors: The program defines several constructors: default and parameterized.

3. getData Method: There's also a getData method that allows setting the length and breadth.

4. Area and Volume Methods: The program defines methods area and volume to calculate the area and volume of a rectangle, respectively.

In summary, this program showcases the use of constructors, constructor overloading, instance variables, and methods to work with rectangles. It creates objects with different dimensions and calculates their areas and volumes.

### User Input

UserInput demonstrates how to take user input using the Scanner class and creates an object to display user information.

1. It creates a Scanner object, input, to take user input.

2. It prompts the user to enter their name, age, and salary.

3. It reads the user's input for each of these values.

4. It creates a UserInput object, user1, with the provided input values.

5. Finally, it displays the user's information using the display method.

## Contributing

We welcome contributions from the community! If you have Java programs to add, improvements to existing code, or suggestions for the repository, please follow these steps:

1. Fork the repository.
2. Create a new branch for your contributions.
3. Add your Java programs or make changes.
4. Commit your changes and provide clear, descriptive commit messages.
5. Push your branch to your forked repository.
6. Open a pull request, explaining the purpose and changes made.

Your contributions will help make this repository a valuable resource for Java enthusiasts.

Happy coding!
