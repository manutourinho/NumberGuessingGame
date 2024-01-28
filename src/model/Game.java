package model;
import java.util.Scanner;

public abstract class Game {
     protected int MIN_RANGE;
     protected int MAX_RANGE;
     protected StringBuilder guesserMessage;
     protected int count = 0;
     protected int MAX_TRIES;
     protected boolean gotRightAnswer;

//  constructors
    public Game() {
        MIN_RANGE = 1;
        MAX_RANGE = 50;
        MAX_TRIES = 10;
    }

    public Game(int initialRange, int endRange, int tries) {
        this.MIN_RANGE = initialRange;
        this.MAX_RANGE = endRange;
        this.MAX_TRIES = tries;
    }

//    base methods to build any game
    protected abstract void resetGame();
    protected abstract void playAgain();
    public abstract void play(Scanner input);

    // g & s
    public int getMIN_RANGE() { return MIN_RANGE; }
    public int getMAX_RANGE() { return MAX_RANGE; }
    public StringBuilder getGuesserMessage() { return guesserMessage; }
    public int getCount() { return count; }
    public int getMAX_TRIES() { return MAX_TRIES; }
    public boolean isGotRightAnswer() { return gotRightAnswer; }


}
