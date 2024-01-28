package model.Messages;

public class MessagesGuessingGame {     // messages displayed through the game organized in a separated class to increase code maintenance and better readability

    public static void welcome(int initialRange, int endRange, int tries) {
        System.out.printf("""
                hello! \uD83D\uDE0A\s
                let's play a little guess the number game, shall we?\u2728 \s
                you have to guess the random right number between %d and %d (inclusive) \s
                \u26A0 be aware that you only have up to %d tries \u26A0
                """, initialRange, endRange, tries);
    }

    public static void win(int count) {
        System.out.println("omg!! are you a magician?! you guessed the right number! \uD83E\uDD73\uD83C\uDF89\uD83C\uDF89 \n" +
                "it took you " + count + " try/tries \uD83C\uDFAF");
    }

    public static void breakpoint() {
        System.out.println("""
                        maybe that's too hard \uD83E\uDD14 \s
                        enter "leave" if you want to exit the game and see the answer\s
                        or enter "continue" if you want to keep trying, I bet you can do it!""");
    }

    public static void higher() {
        System.out.println("too low!");
    }

    public static void lower() {
        System.out.println("too high!");
    }

    public static void lastTry() {
        System.out.println("don't wanna be noisy or anything... but... that's your last chance");
    }

    public static void gameOver(int answer) {
        System.out.println("you couldn't guess the right number, but don't be sad! the answer was: " + answer + ". better luck next time! \uD83C\uDF40");
    }

    public static void playAgain() {
        System.out.println("really?? \uD83E\uDD79 starting one more round in 3... 2... 1...");
    }

    public static void finishApp() {
        System.out.println("okayy! thaks for playing tho! byebye \uD83D\uDE1A");
    }
}
