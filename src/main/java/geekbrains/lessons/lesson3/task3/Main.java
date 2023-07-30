package geekbrains.lessons.lesson3.task3;

public class Main {
    public static void main(String[] args) {
        try {
            double result = divide(6, 0);
            System.out.println("result = " + result);
        } catch (DivisionByZeroException e) {
            e.printStackTrace();
        }
    }

    public static double divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return (double) a / b;
    }
}
