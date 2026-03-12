# SumTwoNums Project

A Java-based implementation of a "Big Number" addition algorithm that simulates how elementary school students perform addition manually (digit-by-digit from right to left).

## Features
- **Big Number Addition:** Handles summation of 2 numbers as strings to avoid primitive data type overflow
- **Step-by-Step Logging:** Uses `java.util.logging` to record the calculation process, including carry-over logic
- **Unit Tested:** Includes comprehensive test cases using JUnit 5

## 🛠️ Requirements
- **Java Development Kit (JDK) 17** or higher.
- **JUnit 5.x** (for running unit tests).
- **IDE:** IntelliJ IDEA (recommended) or VS Code.

## 📁 Project Structure
Following the standard convention for Java projects:
```text
project-root/
├── src/
│   └── SumTwoNums.java      # Core logic and Console UI
├── test/
│   └── SumTwoNumsTest.java  # Unit tests for the sum algorithm
├── lib/                     # Folder for manual .jar dependencies (if not using Maven)
└── README.md
