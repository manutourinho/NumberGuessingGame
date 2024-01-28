package model;
import model.Messages.MessagesGuessingGame;
import java.math.BigInteger;
import java.util.Scanner;

public class GuessingGameApp extends Game {
    private boolean isValidMessage = false;
    private final BigInteger breakpoint = new BigInteger(String.valueOf(MAX_TRIES / 2));

//  constructors
    public GuessingGameApp() {      // constructor for default game initiation
        super();
    }

    public GuessingGameApp(int initialRange, int endRange, int tries) {     // customized number's range and playing rounds
        super(initialRange, endRange, tries);
    }
        
    @Override
    protected void resetGame() {
        RandomNumberGenerator.generateRandomNumber(this);
        count = 0;
        gotRightAnswer = false;
    }

    @Override
    protected void playAgain() {
        resetGame();
        boolean isValidMessage = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("let's play again? (yes/no)");

        while (!isValidMessage) {       // loop to continuously ask for a valid input
            guesserMessage = new StringBuilder(scanner.next());

            if (getGuesserMessage().compareTo(new StringBuilder("yes")) == 0) {
                MessagesGuessingGame.playAgain();
                play(scanner);
            } else if (getGuesserMessage().compareTo(new StringBuilder("no")) == 0){
                MessagesGuessingGame.finishApp();
                isValidMessage = true;
            } else {
                System.out.println("what? sorry, only \"yes\" or \"no\" answers");
            }
        }

        scanner.close();
    }

    @Override
    public void play(Scanner input) {
        RandomNumberGenerator.generateRandomNumber(this);
        MessagesGuessingGame.welcome(getMIN_RANGE(), getMAX_RANGE(), getMAX_TRIES());

        outerLoop:      // defining an outer loop in order to exit if the user wants to end the game when the breakpoint is reached
        while (count < MAX_TRIES) {
            NumberValidation.isValidNumber(input, getMIN_RANGE(), getMAX_RANGE());
            count++;

            if (NumberValidation.getGuesser() == RandomNumberGenerator.getAnswer()) {
                MessagesGuessingGame.win(getCount());
                playAgain();        // asks if the user wants to play one more round, if so, the game is restarted with its initial values
            } else if ((NumberValidation.getGuesser() < RandomNumberGenerator.getAnswer()) && (count != MAX_TRIES)) {
                MessagesGuessingGame.higher();      // giving a tip to the user comparing the input to the answer
            } else if ((NumberValidation.getGuesser() > RandomNumberGenerator.getAnswer()) && (count != MAX_TRIES)) {
                MessagesGuessingGame.lower();
            }

            if ((count + 1) == MAX_TRIES) {
                MessagesGuessingGame.lastTry();
            }

            if (breakpoint.equals(new BigInteger(String.valueOf(count)))) {      // asks if the user wants to continue the game when the breakpoint is reached (useful when the user simply can't get the right answer or when the number of tries is just too big)
                MessagesGuessingGame.breakpoint();
                do {
                    guesserMessage = new StringBuilder(input.next());
                    if (guesserMessage.compareTo(new StringBuilder("leave")) == 0) {
                        break outerLoop;        // breaks the first while loop and goes straight to the game over part
                    } else if (guesserMessage.compareTo(new StringBuilder("continue")) == 0) {
                        System.out.println("okay, let's go on then! you still have " + breakpoint + " more tries");
                        isValidMessage = true;      // invalidates the nested loop and continues the game
                    } else {
                        System.out.println("sorry, dunno what tou mean. insert \"continue\" or \"leave\"");     // message validation
                    }
                } while (!isValidMessage);
            }
        }

        if (!gotRightAnswer) {      // game over!
            MessagesGuessingGame.gameOver(RandomNumberGenerator.getAnswer());
            playAgain();        // asks if the user wants to play one more round, if so, the game is restarted with its initial values
        }
    }


}
