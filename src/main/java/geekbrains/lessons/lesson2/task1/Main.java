package geekbrains.lessons.lesson2.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter inter of array");
        int index = sc.nextInt();

        // Now
        if (index >= 0 && index < arr.length) {
            arr[index] = 1;
        } else {
            System.out.println("The index is specified outside the array");
        }

//        // Before
//        try {
//            arr[index] = 1;
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("The index is specified outside the array");
//        }
    }
}
