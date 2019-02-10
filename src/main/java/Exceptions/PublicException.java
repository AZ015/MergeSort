package Exceptions;

public class PublicException extends Exception {
    private final String key, value;
    private static final String strFormat;

    static {
        strFormat = "Пожалуйста проверьте свой входной файл. Строка % не может быть преобразована к %";
    }

    public PublicException(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String getMessage() {
        return String.format(strFormat, value, key);
    }
}
