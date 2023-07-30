package geekbrains.homeworks.homework1.task3;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;

            System.out.println(a / b);
            printSum(23, 234);

            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("The pointer cannot point to null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("The array goes beyond its size!");
        } catch (Throwable ex) {
            System.out.println("Something went wrong...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
