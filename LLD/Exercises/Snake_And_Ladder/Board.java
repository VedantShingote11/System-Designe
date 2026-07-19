package Exercises.Snake_And_Ladder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {

    int size;
    Cell[][] board;
    Map<Integer, int[]> positions;

    public Board(int n) {
        init(n);
    }

    public void init(int n) {
        this.size = n;
        this.board = new Cell[n][n];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = new Cell(null);
            }
        }

        this.positions = new HashMap<>();
        addPositions(positions, size);
    }

    public void addPositions(Map<Integer, int[]> positions, int size) {

        int flag = 0;
        int pos = 1;

        for (int i = size - 1; i >= 0; i--) {
            if (flag == 0) {
                for (int j = 0; j < size; j++) {
                    positions.put(pos, new int[] { i, j });
                    pos++;
                }
                flag = 1 - flag;
            } else {
                for (int j = size - 1; j >= 0; j--) {
                    positions.put(pos, new int[] { i, j });
                    pos++;
                }
                flag = 1 - flag;
            }
        }
    }

    public void updatePos(Player player, int points) {

        int pos = player.position + points;

        if (pos > 100)
            return;

        int i = positions.get(pos)[0];
        int j = positions.get(pos)[1];

        if (board[i][j] != null && board[i][j].jump != null) {

            int newPos = board[i][j].jump.end;
            player.position = newPos;

        } else {
            player.position = pos;
        }

    }

    public void addSnakedAndLadder(List<int[]> snakePos, List<int[]> ladderPos) {

        for (int[] ladder : ladderPos) {

            int start = ladder[0];
            int end = ladder[1];

            if (start < end && start > 0 && end <= size * size) {
                int i = positions.get(start)[0];
                int j = positions.get(start)[1];
                board[i][j].jump = new Jump(start, end);
            }

        }

        for (int[] snake : snakePos) {
            int start = snake[0];
            int end = snake[1];

            if (start > end && start <= (size * size) - 1 && end > 0) {
                int i = positions.get(start)[0];
                int j = positions.get(start)[1];
                board[i][j].jump = new Jump(start, end);
            }
        }

    }
}
