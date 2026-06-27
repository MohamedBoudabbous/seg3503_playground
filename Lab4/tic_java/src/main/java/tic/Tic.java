package tic;
import java.util.Objects;

public class Tic {
    private final int rows;
    private final int cols;

    public Tic(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (!(other instanceof Tic tic)) {
            return false;
        }

        return rows == tic.rows && cols == tic.cols;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rows, cols);
    }

   
}