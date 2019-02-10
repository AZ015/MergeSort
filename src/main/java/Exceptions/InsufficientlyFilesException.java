package Exceptions;

public class InsufficientlyFilesException extends Exception {
    private final String message = "Недостаточное количество файлов";

    @Override
    public String getMessage() {
        return message;
    }
}
