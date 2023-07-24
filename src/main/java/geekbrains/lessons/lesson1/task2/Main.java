package geekbrains.lessons.lesson1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 0, 9, 6};

        dialog(arr);
    }

    private static void dialog(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int code = checkArray(arr, num);

        parseCode(code);
    }

    private static void parseCode(int code) {
        switch (code) {
            case -1 -> System.out.println("The length of the array is less than minimum");
            case -2 -> System.out.println("Element not found");
            case -3 -> System.out.println("Array not initialized");
            default -> System.out.println("Index of the element: " + code);
        }
    }

    private static int checkArray(int[] arr, int num) {
        if (arr == null) {
            return -3;
        }

        int minLength = 5;

        if (arr.length < minLength) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }

        return -2;
    }
}
