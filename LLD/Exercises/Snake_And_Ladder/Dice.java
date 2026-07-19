package Exercises.Snake_And_Ladder;

import java.util.Random;

public class Dice {

    int sides;
    int rollCnt;

    public Dice(int sides, int rollCnt) {
        this.sides = sides;
        this.rollCnt = rollCnt;
    }

    public int rollDice() {

        int steps = 0;
        Random rand = new Random();

        int i = 0;
        while (i < rollCnt) {
            steps += rand.nextInt(sides) + 1;
            i++;
        }

        return steps;

    }
}
