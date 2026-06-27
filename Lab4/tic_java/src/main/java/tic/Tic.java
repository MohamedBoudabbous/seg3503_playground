package tic;

import java.util.Arrays;
import java.util.Objects;

public class Tic {
    private final String[][] board;
    private final int rows;
    private final int cols;
    private String turn;

    public Tic(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.turn = "X";
        this.board = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            Arrays.fill(this.board[row], "_");
        }
    }

    public String getTurn() {
        return turn;
    }

    public String cellAt(int row, int col) {
        validatePosition(row, col);
        return board[row][col];
    }

    public boolean place(int row, int col) {
        validatePosition(row, col);

        if (!board[row][col].equals("_")) {
            return false;
        }

        board[row][col] = turn;
        switchTurn();
        return true;
    }

    public boolean isEmpty() {
        for (String[] row : board) {
            for (String cell : row) {
                if (!cell.equals("_")) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isFull() {
        for (String[] row : board) {
            for (String cell : row) {
                if (cell.equals("_")) {
                    return false;
                }
            }
        }

        return true;
    }

    private void switchTurn() {
        turn = turn.equals("X") ? "O" : "X";
    }

    private void validatePosition(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            throw new IllegalArgumentException("Invalid board position");
        }
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        for (int row = 0; row < rows; row++) {
            if (row > 0) {
                output.append("\n");
            }

            for (int col = 0; col < cols; col++) {
                if (col > 0) {
                    output.append("|");
                }

                output.append(board[row][col]);
            }
        }

        return output.toString();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (!(other instanceof Tic tic)) {
            return false;
        }

        return rows == tic.rows
                && cols == tic.cols
                && Objects.equals(turn, tic.turn)
                && Arrays.deepEquals(board, tic.board);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(rows, cols, turn);
        result = 31 * result + Arrays.deepHashCode(board);
        return result;
    }
}