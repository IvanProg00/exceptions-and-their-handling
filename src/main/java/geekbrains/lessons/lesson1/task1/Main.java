package geekbrains.lessons.lesson1.task1;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 6, 4, 5, -7};

        System.out.println(checkLength(arr));
    }

    private static int checkLength(int[] arr) {
        int minLength = 5;

        if (arr.length < minLength) {
            return -1;
        }

        return arr.length;
    }
}
