package geekbrains.lessons.lesson3.task1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void doSomething() throws IOException {
    }
}
