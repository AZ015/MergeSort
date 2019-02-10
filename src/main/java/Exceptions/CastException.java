package Exceptions;

public class CastException extends Exception {
    private String message = "Данные не верны";

    @Override
    public String getMessage() {
        return message;
    }
}
