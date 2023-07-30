package geekbrains.homeworks.homework1.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float result = askFloat();
        System.out.println("result = " + result);
    }

    public static float askFloat() {
        float number = 0;
        boolean numberCreated = false;
        Scanner sc = new Scanner(System.in);

        while (!numberCreated) {
            try {
                System.out.print("Enter the number: ");
                number = Float.parseFloat(sc.nextLine());
                numberCreated = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, try again");
            }
        }

        sc.close();

        return number;
    }
}
