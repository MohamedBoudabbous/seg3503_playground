package tic;

import java.util.Arrays;
import java.util.Objects;

public class Tic {
    private static final String EMPTY_CELL = "_";
    private static final String FIRST_PLAYER = "X";
    private static final String SECOND_PLAYER = "O";

    private final String[][] board;
    private final int rows;
    private final int cols;
    private String turn;

    public Tic(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.turn = FIRST_PLAYER;
        this.board = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            Arrays.fill(this.board[row], EMPTY_CELL);
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

        if (!isCellEmpty(row, col)) {
            return false;
        }

        board[row][col] = turn;
        switchTurn();
        return true;
    }

    public boolean isEmpty() {
        for (String[] row : board) {
            for (String cell : row) {
                if (!cell.equals(EMPTY_CELL)) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isFull() {
        for (String[] row : board) {
            for (String cell : row) {
                if (cell.equals(EMPTY_CELL)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isCellEmpty(int row, int col) {
        return board[row][col].equals(EMPTY_CELL);
    }

    private void switchTurn() {
        turn = turn.equals(FIRST_PLAYER) ? SECOND_PLAYER : FIRST_PLAYER;
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