package Exceptions;

public class FileEmptyExceptions extends Exception {
    private final String message = "Файл пустой";

    @Override
    public String getMessage() {
        return message;
    }
}
