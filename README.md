# Student Grade Tracker

## Overview
A simple Java console program to track student grades. It allows users to input multiple students' names and grades, then calculates and displays:

- Average grade
- Highest grade and corresponding student
- Lowest grade and corresponding student

## Features
- Uses `ArrayList` to store student records.
- Validates user input.
- Displays a summary report.

## How to Run

### Requirements
- Java Development Kit (JDK)

### Steps
1. Open terminal or command prompt.
2. Navigate to the folder containing the source code.
3. Compile:
   ```
   javac StudentGradeTracker.java
   ```
4. Run:
   ```
   java StudentGradeTracker
   ```

## Example
```
===== Student Grade Tracker =====
Enter student name (or type 'done' to finish): Ram
Enter grade for Ram: 85
Enter student name (or type 'done' to finish): Shyam
Enter grade for Shyam: 92
Enter student name (or type 'done' to finish): done

===== Summary Report =====
Student: Ram | Grade: 85.0
Student: Shyam | Grade: 92.0

Average Grade: 88.50
Highest Grade: 92.00 by Shyam
Lowest Grade: 85.00 by Ram
``
