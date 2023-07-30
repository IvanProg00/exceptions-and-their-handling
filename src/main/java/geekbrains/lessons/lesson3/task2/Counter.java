package geekbrains.lessons.lesson3.task2;

import java.io.IOException;

public class Counter implements AutoCloseable {
    private int count;
    private boolean closed;

    public void add() throws IOException {
        if (closed) {
            throw new IOException("Resource closed");
        }

        count++;
    }

    @Override
    public void close() {
        closed = true;
    }

    public boolean isClosed() {
        return closed;
    }

    public int getCount() {
        return count;
    }
}
