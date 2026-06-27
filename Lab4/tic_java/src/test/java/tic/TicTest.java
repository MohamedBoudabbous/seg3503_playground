package tic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTest {

    @Test
    void constructorCreatesEquivalentEmptyBoards() {
        Tic board = new Tic(3, 3);
        Tic board2 = new Tic(3, 3);

        assertEquals(board, board2);
    }
    @Test
    void emptyBoardHasReadableString() {
        Tic board = new Tic(3, 3);

        assertEquals("_|_|_\n_|_|_\n_|_|_", board.toString());
    }
}