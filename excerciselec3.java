package Lec3_scanner;

import java.util.Scanner;

public class excerciselec3 {
    public static void main(String[] args) {
        simpleConsoleOutput();
        consoleInput();
        readingIntegers();
        readingDoubles();
        readingBooleans();
        readingStrings();
        readingFullLine();
        multipleInputs();
        fixNextIntAndNextLine();
        changeDelimiter();
    }

    public static void simpleConsoleOutput() {
        int number = 42;
        System.out.println("The answer to everything is " + number);
    }

    public static void consoleInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }

    public static void readingIntegers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        System.out.println("The sum is: " + (num1 + num2));
    }

    public static void readingDoubles() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first float number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second float number: ");
        double num2 = scanner.nextDouble();

        double average = (num1 + num2) / 2;
        System.out.println("The average is: " + average);
    }

 
    public static void readingBooleans() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a boolean value (true/false): ");
        boolean value = scanner.nextBoolean();

        System.out.println("You entered: " + value);
    }

 
    public static void readingStrings() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.println("Hello, " + fullName);
    }

  
    public static void readingFullLine() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("You entered: " + sentence);
    }


    public static void multipleInputs() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();

        System.out.println("First word: " + word1);
        System.out.println("Second word: " + word2);
        System.out.println("Third word: " + word3);
    }

   
    public static void fixNextIntAndNextLine() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("Number: " + number);
        System.out.println("Sentence: " + sentence);
    }

    public static void changeDelimiter() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("##|\\n");

        System.out.println("Enter words separated by '##': ");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}
        