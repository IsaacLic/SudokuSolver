import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class SolutionTest {

    int[][] board;

    @BeforeEach
    void setUp() {
        board = new int[][]{
                {1, 2, 3, 4},
                {2, 3, 4, 1},
                {3, 4, 1, 2},
                {4, 1, 2, 3}
        };
    }

    @Test
    public void checkNoDuplicatesInRow() {
        for (int i = 0; i < board.length; i++) {
            Set intsInRow = new HashSet<Integer>();
            for (int j = 0; j < board[0].length; j++) {
                assert !intsInRow.contains(board[i][j]);
                intsInRow.add(board[i][j]);
            }
        }
    }

    @Test
    public void checkNoDuplicatesInColumn() {
        for (int j = 0; j < board[0].length; j++) {
            Set intsInColumn = new HashSet<Integer>();
            for (int i = 0; i < board.length; i++) {
                assert !intsInColumn.contains(board[i][j]);
                intsInColumn.add(board[i][j]);
            }
        }
    }
}
