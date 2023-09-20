package Libruary;

public class Reader {
    public String name;
    public int card;
    public String faculty;
    public String birthday;
    public String phone;

    public Reader(String name, int card, String faculty, String birthday, String phone) {
        this.name = name;
        this.card = card;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phone = phone;
    }
    public void takeBook(int number) {
        System.out.println(this.name + " взял " + number + " книг");
    }

    public void takeBook(String[] titles) {
        System.out.print(this.name + " взял книги: ");
        for (int i = 0; i < titles.length - 1; i++) {
            System.out.println(titles[i] + ", ");
        }
        System.out.println(titles[titles.length - 1]);
    }

    public void takeBook(Book[] books) {
        System.out.print(this.name + " взял книги: ");
        for (int i = 0; i < books.length - 1; i++) {
            System.out.print(books[i].title + ", ");
        }
        System.out.println(books[books.length - 1].title);
    }

    public void returnBook(int number) {
        System.out.println(this.name + " вернул " + number + " книг");
    }

    public void returnBook(String[] titles) {
        System.out.print(this.name + " вернул книги: ");
        for (int i = 0; i < titles.length - 1; i++) {
            System.out.print(titles[i] + ", ");
        }
        System.out.println(titles[titles.length - 1]);
    }

    public void returnBook(Book[] books) {
        System.out.print(this.name + " вернул книги: ");
        for (int i = 0; i < books.length - 1; i++) {
            System.out.print(books[i].title + ", ");
        }
        System.out.println(books[books.length - 1].title);
    }

    @Override
    public String toString() {
        return "Читатель {" +
                "Имя: " + name +
                ", Читательский билет: " + card +
                ", Факультет: " + faculty +
                ", Дата роджения: " + birthday +
                ", Телефон: " + phone +
                '}';
    }
}
