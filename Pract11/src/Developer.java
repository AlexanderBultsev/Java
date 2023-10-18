import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Developer {
    String name;
    Date receiving;
    Date submitting;
    SimpleDateFormat dateFormatter = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");

    public Developer(String name) {
        this.name = name;
    }

    public String receive() {
        this.receiving = new Date(System.currentTimeMillis());
        return "Разработчик " + name +
                " получил задание: " + dateFormatter.format(receiving);
    }

    public String submit() {
        this.submitting = new Date(System.currentTimeMillis());
        return "Разработчик " + name +
                " сдал задание: " + dateFormatter.format(submitting);
    }

    @Override
    public String toString() {
        return "Разработчик: " + name +
                ", время получение задания: " + dateFormatter.format(receiving) +
                ", время сдача задания: " + dateFormatter.format(submitting);
    }

    public static void main(String[] args) {
        System.out.print("Введите имя разработчика: ");
        Scanner scanner = new Scanner(System.in);
        Developer developer = new Developer(scanner.nextLine());

        System.out.println("Введите: получить или сдать");
        String input;
        do {
            input = scanner.nextLine();
            switch (input) {
                case "получить":
                    System.out.println(developer.receive());
                    break;
                case "сдать":
                    System.out.println(developer.submit());
                    break;
            }
        } while (!input.equals("сдать"));
        System.out.println(developer);
    }
}
