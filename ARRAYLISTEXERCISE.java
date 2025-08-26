
package Lec6_array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class ARRAYLISTEXERCISE {
    public static void main(String[] args) {
      System.out.println("Bai:1");
        System.out.print("Enter number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int max = arr1[0], min = arr1[0];
        for (int i = 1; i < n; i++) {
            if (arr1[i] > max) max = arr1[i];
            if (arr1[i] < min) min = arr1[i];
        }
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);

        System.out.println("Bai:2");
        int[] numbers = {11, 42, -5, 27, 0, 89};
        System.out.println("Original array: " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(numbers));

        System.out.println("Bai:3");
        int[] arr3 = {2, 5, 6, 5, 2, 5};
        System.out.println("Array: " + Arrays.toString(arr3));
        System.out.print("Enter number X to count: ");
        int x = sc.nextInt();
        int count = 0;
        for (int num : arr3) {
            if (num == x) count++;
        }
        System.out.println("The number " + x + " appears " + count + " times.");

        System.out.println("Bai:4");
        ArrayList<String> todoList = new ArrayList<>();
        todoList.add("Do homework");
        todoList.add("Go shopping");
        System.out.println("Current tasks: " + todoList);
        todoList.remove(0);
        System.out.println("After removing first task: " + todoList);

        System.out.println("Bai:5");
        int[] arr5 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Original array: " + Arrays.toString(arr5));
        ArrayList<Integer> evens = new ArrayList<>();
        for (int num : arr5) {
            if (num % 2 == 0) evens.add(num);
        }
        System.out.println("Even numbers: " + evens);

        sc.close();
    }
    
}
