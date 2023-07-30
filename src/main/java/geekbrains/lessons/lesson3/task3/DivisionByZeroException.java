package geekbrains.lessons.lesson3.task3;

public class DivisionByZeroException extends IllegalArgumentException {
    @Override
    public String getMessage() {
        return "Can not be divided by zero.";
    }
}
