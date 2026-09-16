
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("      STUDENT GRADE CALCULATOR");
        System.out.println("==================================");

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks for English: ");
        double english = scanner.nextDouble();

        System.out.print("Enter marks for Mathematics: ");
        double mathematics = scanner.nextDouble();

        System.out.print("Enter marks for Science: ");
        double science = scanner.nextDouble();

        System.out.print("Enter marks for Computer: ");
        double computer = scanner.nextDouble();

        System.out.print("Enter marks for Social Science: ");
        double socialScience = scanner.nextDouble();

        // Calculate total and average
        double total = english + mathematics + science + computer + socialScience;
        double average = total / 5;

        // Calculate grade
        String grade;

        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display result
        System.out.println("\n==================================");
        System.out.println("           STUDENT RESULT");
        System.out.println("==================================");

        System.out.println("Student Name : " + name);
        System.out.println("Total Marks  : " + total + " / 500");
        System.out.printf("Average      : %.2f%%%n", average);
        System.out.println("Grade        : " + grade);

        if (average >= 50) {
            System.out.println("Result       : PASS");
        } else {
            System.out.println("Result       : FAIL");
        }

        System.out.println("==================================");

        scanner.close();
    }
}

