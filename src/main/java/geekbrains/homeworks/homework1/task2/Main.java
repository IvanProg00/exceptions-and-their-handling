package geekbrains.homeworks.homework1.task2;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[15];
        int index = 8;
        int d = 1;

        if (index < 0 || index > intArray.length) {
            System.out.println("Index outside the array");
        } else if (d == 0) {
            System.out.println("Devide by zero not possible");
        } else {
            double catchedRes1 = intArray[index] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }
    }
}
