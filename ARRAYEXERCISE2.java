
package Lec6_array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ARRAYEXERCISE2 {
    
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Bai1:");
        System.out.print("Enter number of elements: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " numbers:");
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();
        int max = arr1[0], min = arr1[0];
        for (int i = 1; i < n1; i++) {
            if (arr1[i] > max) max = arr1[i];
            if (arr1[i] < min) min = arr1[i];
        }
        System.out.println("Max = " + max + ", Min = " + min);

        System.out.println("Bai2:");
        int[] arr2 = {11, 42, -5, 27, 0, 89};
        for (int i = 0; i < arr2.length / 2; i++) {
            int temp = arr2[i];
            arr2[i] = arr2[arr2.length - 1 - i];
            arr2[arr2.length - 1 - i] = temp;
        }
        System.out.println("Reversed: " + Arrays.toString(arr2));

        System.out.println("Bai3:");
        int[] arr3 = {2, 5, 6, 5, 2, 5};
        System.out.print("Enter number to count: ");
        int x = sc.nextInt(), count = 0;
        for (int n : arr3) if (n == x) count++;
        System.out.println(x + " appears " + count + " times.");

        System.out.println("Bai4:");
        ArrayList<String> tasks = new ArrayList<>();
        System.out.print("How many tasks to add? ");
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            System.out.print("Enter task " + (i+1) + ": ");
            tasks.add(sc.nextLine());
        }
        System.out.println("Tasks: " + tasks);
        if (!tasks.isEmpty()) {
            System.out.print("Enter index to remove: ");
            int idx = sc.nextInt();
            if (idx >= 0 && idx < tasks.size()) tasks.remove(idx);
        }
        System.out.println("Tasks after removal: " + tasks);

        System.out.println("Bai5:");
        int[] arr5 = {1,2,3,4,5,6,7,8};
        ArrayList<Integer> evens = new ArrayList<>();
        for (int n : arr5) if (n % 2 == 0) evens.add(n);
        System.out.println("Even numbers: " + evens);

        System.out.println("Bai6:");
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;
        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;
            numbers.add(num);
            sum += num;
        }

        System.out.println("Numbers entered: " + numbers);
        System.out.println("The sum is: " + sum);

        System.out.println("Bai7:");
        ArrayList<Integer> arr7 = new ArrayList<>(Arrays.asList(1,3,2,1,4,3,5));
        ArrayList<Integer> result7 = new ArrayList<>();
        for (int n : arr7) if (!result7.contains(n)) result7.add(n);
        System.out.println("Without duplicates: " + result7);

        System.out.println("Bai8:");
        int[] arr8 = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) arr8[i] = sc.nextInt();
        Arrays.sort(arr8);
        System.out.println("Sorted: " + Arrays.toString(arr8));
        System.out.print("Enter number to search: ");
        int search = sc.nextInt(), index = -1;
        for (int i = 0; i < arr8.length; i++) if (arr8[i] == search) index = i;
        if (index != -1) System.out.println(search + " found at index " + index);
        else System.out.println(search + " not found.");

        System.out.println("Bai9:");
        int[] arr9 = {10,20,30};
        System.out.println("Before: " + Arrays.toString(arr9));
        System.out.print("Enter two indices to swap: ");
        int i = sc.nextInt(), j = sc.nextInt();
        if (i>=0 && j>=0 && i<arr9.length && j<arr9.length) {
            int temp = arr9[i]; arr9[i] = arr9[j]; arr9[j] = temp;
        }
        System.out.println("After swap: " + Arrays.toString(arr9));

        System.out.println("Bai10:");
        int[] a1 = {1,2,3}, a2 = {4,5,6};
        int[] result10 = new int[a1.length+a2.length];
        for (int k=0; k<a1.length; k++) result10[k]=a1[k];
        for (int k=0; k<a2.length; k++) result10[a1.length+k]=a2[k];
        System.out.println("Concatenated: " + Arrays.toString(result10));

        System.out.println("Bai11:");
        int[] arr11 = {10,5,8,20,15,20};
        int largest=Integer.MIN_VALUE, second=Integer.MIN_VALUE;
        for (int n : arr11) {
            if (n>largest){ second=largest; largest=n; }
            else if (n>second && n<largest) second=n;
        }
        System.out.println("Second largest = " + second);

        System.out.println("Bai12:");
        System.out.print("Enter a lowercase string: ");
        sc.nextLine();
        String s = sc.nextLine();
        int[] freq = new int[26];
        for (char c : s.toCharArray())
            if (c>='a'&&c<='z') freq[c-'a']++;
        for (int k=0;k<26;k++)
            if (freq[k]>0) System.out.println((char)(k+'a')+": "+freq[k]);

        System.out.println("Bai13:");
        int[] m1 = {1,4,6}, m2 = {2,3,5};
        int[] merged = new int[m1.length+m2.length];
        int p=0,q=0,r=0;
        while(p<m1.length && q<m2.length){
            if(m1[p]<m2[q]) merged[r++]=m1[p++];
            else merged[r++]=m2[q++];
        }
        while(p<m1.length) merged[r++]=m1[p++];
        while(q<m2.length) merged[r++]=m2[q++];
        System.out.println("Merged: " + Arrays.toString(merged));

        System.out.println("Bai14:");
        ArrayList<Integer> arr14 = new ArrayList<>(Arrays.asList(10,60,25,80,5,95));
        for (int k=arr14.size()-1;k>=0;k--)
            if(arr14.get(k)>50) arr14.remove(k);
        System.out.println("After removal: " + arr14);

        System.out.println("Bai15:");
        String[] arr15 = {"Ann","Bob"};
        ArrayList<String> list15 = new ArrayList<>(Arrays.asList(arr15));
        System.out.println("Array -> ArrayList: " + list15);
        ArrayList<String> list15b = new ArrayList<>(Arrays.asList("Charles","David"));
        String[] arr15b = list15b.toArray(new String[0]);
        System.out.println("ArrayList -> Array: " + Arrays.toString(arr15b));
    }
}
