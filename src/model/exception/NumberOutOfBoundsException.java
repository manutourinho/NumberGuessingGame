package model.exception;

public class NumberOutOfBoundsException extends RuntimeException{
//  custom exception to deal with inputs out of the specified range of numbers
    public NumberOutOfBoundsException(String message) {
        super(message);
    }

}
