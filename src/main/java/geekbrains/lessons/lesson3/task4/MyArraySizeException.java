package geekbrains.lessons.lesson3.task4;

public class MyArraySizeException extends IllegalArgumentException {
    private final int expected;
    private final int provided;

    public MyArraySizeException(int expected, int provided) {
        super();
        this.expected = expected;
        this.provided = provided;
    }

    @Override
    public String getMessage() {
        return "Expected array length: " + expected + ". Provided length: " + provided;
    }
}
