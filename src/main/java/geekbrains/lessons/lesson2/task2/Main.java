package geekbrains.lessons.lesson2.task2;

public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"1", "23", "0"}, {"sdfsd", "44"}};
        System.out.println(ex2(arr));
    }

    public static int ex2(String[][] arr) {
        int sum = 0;

        for (String[] strings : arr) {
            for (String item : strings) {
                if (checkText(item)) {
                    int val = Integer.parseInt(item);
                    sum += val;
                }
            }
        }

        return sum;
    }

    private static boolean checkText(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }

        return true;
    }
}
