package geekbrains.homeworks.homework1.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        try {
            validate_string(str);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validate_string(String str) throws IllegalArgumentException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("String cannot be empty");
        }
    }
}
