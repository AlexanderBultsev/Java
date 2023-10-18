import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CompareToNow {
    public static String compareToNow(Date userDate) {
        Date now = new Date();
        return switch (userDate.compareTo(now)) {
            case -1 -> "Дата меньше текущей";
            case 0 -> "Дата равна текушей";
            case 1 -> "Дата больще текущей";
            default -> "Ошибка";
        };
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
        System.out.println("Введите дату в формате: 'чч:мм:сс дд.мм.гггг'");

        Scanner scanner = new Scanner(System.in);
        Date userDate = dateFormatter.parse(scanner.nextLine());

        System.out.println(compareToNow(userDate));
    }
}
