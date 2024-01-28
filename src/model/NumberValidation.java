package model;
import model.exception.NumberOutOfBoundsException;
import java.util.Scanner;

public class NumberValidation {
    private static int guesser;

    public static void isValidNumber(Scanner input, int initialRange, int endRange) throws NumberOutOfBoundsException {
        boolean isValidInput = false;

        while(!isValidInput) {
            guesser = input.nextInt();
            try {
                if ((guesser >= initialRange) && (guesser <= endRange)) {
                    isValidInput = true;
                } else {
                    throw new NumberOutOfBoundsException("that's not right, the number needs to be between "
                            + initialRange + " and " + endRange + ". try again!");
                }
            } catch (NumberOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int getGuesser() { return guesser; }
}
