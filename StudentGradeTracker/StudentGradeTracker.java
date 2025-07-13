import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    double grade;

    Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("===== Student Grade Tracker =====");

        while (true) {
            System.out.print("Enter student name (or type 'done' to finish): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter grade for " + name + ": ");
            double grade;

            // Validate numeric input
            while (true) {
                try {
                    grade = Double.parseDouble(scanner.nextLine());
                    if (grade < 0 || grade > 100) {
                        System.out.print("Grade must be between 0 and 100. Enter again: ");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.print("Invalid number. Enter a valid grade: ");
                }
            }

            students.add(new Student(name, grade));
        }

        if (students.isEmpty()) {
            System.out.println("No students entered.");
        } else {
            displaySummary(students);
        }

        scanner.close();
    }

    public static void displaySummary(ArrayList<Student> students) {
        double total = 0;
        double highest = Double.MIN_VALUE;
        double lowest = Double.MAX_VALUE;
        String highestStudent = "", lowestStudent = "";

        System.out.println("\n===== Summary Report =====");

        for (Student s : students) {
            System.out.println("Student: " + s.name + " | Grade: " + s.grade);
            total += s.grade;

            if (s.grade > highest) {
                highest = s.grade;
                highestStudent = s.name;
            }

            if (s.grade < lowest) {
                lowest = s.grade;
                lowestStudent = s.name;
            }
        }

        double average = total / students.size();

        System.out.printf("\nAverage Grade: %.2f\n", average);
        System.out.printf("Highest Grade: %.2f by %s\n", highest, highestStudent);
        System.out.printf("Lowest Grade: %.2f by %s\n", lowest, lowestStudent);
    }
}
