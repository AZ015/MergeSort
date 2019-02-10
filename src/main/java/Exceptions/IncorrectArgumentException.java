package Exceptions;

public class IncorrectArgumentException extends Exception {
    private final String message = "Некорректно введены аргументы." +
            " Пожалуйста, введите аргументы в следующем порядке: \n" +
            "1 - Режим сортировки (-a, -d),\n" +
            "2 - Тип данных (-s, -d),\n" +
            "3 - Имя выходного файла,\n" +
            "4 - Имя входных файлов (не менее 1)";


    @Override
    public String getMessage() {
        return message;
    }
}
