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

    @Test
    void placingMoveWritesXAtCell() {
        Tic board = new Tic(3, 3);

        assertTrue(board.place(1, 1));

        assertEquals("X", board.cellAt(1, 1));
        assertEquals("_|_|_\n_|X|_\n_|_|_", board.toString());
    }

    @Test
    void turnStartsWithXAndSwitchesAfterMove() {
        Tic board = new Tic(3, 3);

        assertEquals("X", board.getTurn());

        board.place(0, 0);
        assertEquals("O", board.getTurn());

        board.place(0, 1);
        assertEquals("X", board.getTurn());
    }

    @Test
    void boardCanDetectEmptyAndFullStates() {
        Tic board = new Tic(1, 2);

        assertTrue(board.isEmpty());
        assertFalse(board.isFull());

        board.place(0, 0);

        assertFalse(board.isEmpty());
        assertFalse(board.isFull());

        board.place(0, 1);

        assertFalse(board.isEmpty());
        assertTrue(board.isFull());
    }
}