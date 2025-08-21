package lec4_ifstatement;

import java.util.Scanner;

public class assignment4 {
    static Scanner scanner = new Scanner(System.in);

    // Bài 1
    public static void evenOdd() {
        System.out.println("\n=== Exercise 1: Even or Odd Checker ===");
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        System.out.println(num + (num % 2 == 0 ? " is an even number" : " is an odd number"));
    }

    // Bài 2
    public static void agee() {
        System.out.println("\n=== Exercise 2: Age Category ===");
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        if (age > 0 && age <= 12)
            System.out.println("You are a child");
        else if (age <= 19)
            System.out.println("You are a teenager");
        else if (age <= 59)
            System.out.println("You are an adult");
        else if (age >= 60)
            System.out.println("You are old");
        else
            System.out.println("Invalid age!");
    }

    // Bài 3
    public static void year() {
        System.out.println("\n=== Exercise 3: Leap Year Checker ===");
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }

    // Bài 4
    public static void operator() {
        System.out.println("\n=== Exercise 4: Calculator ===");
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+': System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); break;
            case '-': System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); break;
            case '*': System.out.println(num1 + " * " + num2 + " = " + (num1 * num2)); break;
            case '/':
                if (num2 != 0)
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                else
                    System.out.println("Error: Division by zero is not allowed");
                break;
            default: System.out.println("Invalid operator!");
        }
    }

    // Bài 5
    public static void dayOfTheWeek() {
        System.out.println("\n=== Exercise 5: Day of the Week ===");
        System.out.print("Enter a number from 1 to 7: ");
        int day = scanner.nextInt();
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Error! Only enter 1–7.");
        }
    }

    // Bài 6
    public static void academicGrading() {
        System.out.println("\n=== Exercise 6: Academic Grading ===");
        System.out.print("Enter average score (0 - 10): ");
        double score = scanner.nextDouble();
        if (score >= 9 && score <= 10)
            System.out.println("Excellent");
        else if (score >= 8)
            System.out.println("Good");
        else if (score >= 6.5)
            System.out.println("Fair");
        else if (score >= 5)
            System.out.println("Average");
        else if (score >= 0)
            System.out.println("Fail");
        else
            System.out.println("Invalid score!");
    }

    // Bài 7
    public static void maximumOfThree() {
        System.out.println("\n=== Exercise 7: Maximum of Three Numbers ===");
        System.out.print("Enter 3 integers: ");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.println("The largest number is: " + max);
    }

    // Bài 8
    public static void quadrantDetermination() {
        System.out.println("\n=== Exercise 8: Quadrant Determination ===");
        System.out.print("Enter x coordinate: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y coordinate: ");
        double y = scanner.nextDouble();
        if (x > 0 && y > 0)
            System.out.println("The point is in the 1st quadrant");
        else if (x < 0 && y > 0)
            System.out.println("The point is in the 2nd quadrant");
        else if (x < 0 && y < 0)
            System.out.println("The point is in the 3rd quadrant");
        else if (x > 0 && y < 0)
            System.out.println("The point is in the 4th quadrant");
        else if (x == 0 && y == 0)
            System.out.println("The point is at the origin");
        else
            System.out.println("The point lies on an axis");
    }

    // Bài 9
    public static void absoluteValue() {
        System.out.println("\n=== Exercise 9: Absolute Value ===");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int abs = (num >= 0) ? num : -num;
        System.out.println("The absolute value is " + abs);
    }

    // Bài 10
    public static void triangleClassifier() {
        System.out.println("\n=== Exercise 10: Triangle Classifier ===");
        System.out.print("Enter three side lengths: ");
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c)
                System.out.println("This is an equilateral triangle.");
            else if (a == b || a == c || b == c)
                System.out.println("This is an isosceles triangle.");
            else
                System.out.println("This is a scalene triangle.");
        } else {
            System.out.println("These sides cannot form a triangle.");
        }
    }

    // Bài 11
    public static void quadraticEquation() {
        System.out.println("\n=== Exercise 11: Quadratic Equation Solver ===");
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        if (a == 0) { 
            if (b == 0) {
                System.out.println("This is not an equation.");
            } else {
                double x = -c / b;
                System.out.println("This is a linear equation. The root is x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("The equation has no real roots.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("The equation has a double root: x1 = x2 = " + x);
            } else {
                double sqrtDelta = Math.sqrt(delta);
                double x1 = (-b + sqrtDelta) / (2 * a);
                double x2 = (-b - sqrtDelta) / (2 * a);
                System.out.println("The equation has two distinct roots: x1 = " + x1 + " and x2 = " + x2);
            }
        }
    }

    public static void main(String[] args) {
        evenOdd();
        agee();
        year();
        operator();
        dayOfTheWeek();
        academicGrading();
        maximumOfThree();
        quadrantDetermination();
        absoluteValue();
        triangleClassifier();
        quadraticEquation();

        scanner.close();
    }
}
