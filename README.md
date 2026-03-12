# SumTwoNums Project

A Java-based implementation of a "Big Number" addition algorithm that simulates how elementary school students perform addition manually (digit-by-digit from right to left).

## Features
- **Big Number Addition:** Handles summation of 2 numbers as strings to avoid primitive data type overflow
- **Step-by-Step Logging:** Uses `java.util.logging` to record the calculation process, including carry-over logic
- **Unit Tested:** Includes comprehensive test cases using JUnit 5

## Requirements
- **Java Development Kit (JDK) 17** or higher.
- **JUnit 5.x** (for running unit tests).
- **IDE:** IntelliJ IDEA (recommended) or VS Code.

## Project Structure
Following the standard convention for Java projects:
```text
project-root/
├── src/
│   └── SumTwoNums.java      # Core logic and Console UI
├── test/
│   └── SumTwoNumsTest.java  # Unit tests for the sum algorithm
├── lib/                     # Folder for manual .jar dependencies (if not using Maven)
└── README.md
```
## Installatiom
- Clone this project using Github Desktop or run this command inside your local folder/repo 
```
git clone https://github.com/NycticoraxA00/Sum2Nums.git
```
## Running the Application
### Inside an IDE (VS Code, InteliJ,...);
- Navigate to the SumTwoNums.java Class and hit run button 
### As a Console Program;
- Navigate to the directory where SumTwoNums.java are in
- Open terminal on your local repo and run `javac SumTwoNums.java`

=> The program will then prompt you to input 2 numbers to perform calculations with logging to the terminal console.

## Running Unit Tests:
### Using Maven:
- Using the command `mvn test`

### Inside an IDE (VS Code, InteliJ,...);
- Right-click the SumTwoNumsTest.java file.
- Select Run 'SumTwoNumsTest'.
- View the results in the Run or Test Runner window.

### Using terminal:
- Download junit-platform-console-standalone-1.10.x.jar from Maven Central.
- Place it in your local repo (in a /lib directory).
- Compile both the program and the unit test using commands:
```
# Compile the main class
javac SumTwoNums.java

# Compile the test class (referencing the JUnit JAR)
javac -cp ".;lib/junit-platform-console-standalone-1.10.2.jar" SumTwoNumsTest.java
```
- Run the test using commands:
```
java -jar lib/junit-platform-console-standalone-1.10.2.jar --class-path . --select-class SumTwoNumsTest
```




