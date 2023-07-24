package geekbrains.lessons.lesson1.task3;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 0, 0}, {0, 2, 0}, {0, 0, 0}};

        try {
            System.out.println("Sum of elements: " + sumArrayItems(arr));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int sumArrayItems(int[][] arr) {
        if (arr == null) {
            throw new RuntimeException("Array not initialized");
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != arr[i].length) {
                throw new RuntimeException("Array is not square");
            }

            for (int j = 0; j < arr[i].length; j++) {
                int item = arr[i][j];

                if (item != 0 && item != 1) {
                    throw new RuntimeException("Element of index [" + i + ", " + j + "] = " + item + ". Expects 0 or 1");
                }

                sum += item;
            }
        }

        return sum;
    }
}
