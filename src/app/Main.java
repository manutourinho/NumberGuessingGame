package app;
import model.Game;
import model.GuessingGameApp;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Game game = new GuessingGameApp(1, 10, 6);
        Scanner input = new Scanner(System.in);
        game.play(input);
        input.close();
    }

}