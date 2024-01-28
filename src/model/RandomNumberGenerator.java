package model;
import java.util.Random;

public class RandomNumberGenerator {
    private static final Random randomNumber = new Random();
    private static int answer;

    public static void generateRandomNumber(GuessingGameApp gameApp) {
        answer = randomNumber.nextInt(gameApp.getMIN_RANGE(), (gameApp.getMAX_RANGE() + 1));
    }

    public static int getAnswer() {
        return answer;
    }
}
