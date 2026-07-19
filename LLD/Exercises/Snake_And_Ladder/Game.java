package Exercises.Snake_And_Ladder;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Game {

    Board board;
    Deque<Player> players;
    Dice dice;

    List<int[]> snakePos;
    List<int[]> ladderPos;

    Game() {
        init();
    }

    public void init() {

        this.board = new Board(10);
        this.dice = new Dice(6, 1);

        this.snakePos = new ArrayList<>();
        this.ladderPos = new ArrayList<>();

        snakePos.add(new int[] { 15, 3 });
        snakePos.add(new int[] { 99, 7 });
        snakePos.add(new int[] { 27, 13 });
        snakePos.add(new int[] { 87, 66 });

        ladderPos.add(new int[] { 5, 16 });
        ladderPos.add(new int[] { 55, 98 });
        ladderPos.add(new int[] { 74, 91 });

        board.addSnakedAndLadder(snakePos, ladderPos);

        this.players = new LinkedList<>();

        players.add(new Player(0, "player 1", 1));
        players.add(new Player(1, "player 2", 1));
        players.add(new Player(2, "player 3", 1));

    }

    public void startGame() {

        boolean hasEnded = false;
        while (!hasEnded) {

            Player currPlayer = players.pollFirst();
            int steps = dice.rollDice();

            board.updatePos(currPlayer, steps);

            if (currPlayer.position == 100) {
                System.out.println(currPlayer.name + " is winner");
                hasEnded = true;
            }

            players.addLast(currPlayer);

        }

    }
}
