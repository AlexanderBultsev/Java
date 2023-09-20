package Libruary;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Reader> readers = new ArrayList<>();
        readers.add(new Reader("Иванов", 125212, "Геология", "24.12.2001", "+7 (914) 122-54-23"));
        readers.add(new Reader("Петров", 523984, "Прогинж", "12.05.1999", "+7 (942) 412-44-21"));
        System.out.println(readers.get(0));
        System.out.println(readers.get(0));

        Book[] books = new Book[]{
                new Book("Портрет Дориана Грея", "Уайльд"),
                new Book("Метро 2033", "Глуховский")};

        readers.get(0).takeBook(5);
        readers.get(0).returnBook(new String[]{"Путь домохозяина. Том 4", "Приключение в Киото. Меч Аматэрасу"});
        readers.get(1).takeBook(books);
    }
}
