import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateCalendarGenerator {
    Date date;
    Calendar calendar;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmm");

    public DateCalendarGenerator() throws ParseException {
        System.out.println("""
                Введите дату в формате
                <гггг><мм><дд>
                <чч><мм>""");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine() + scanner.nextLine();
        date = formatter.parse(input);
        calendar = formatter.getCalendar();
    }

    public static void main(String[] args) throws ParseException {
        DateCalendarGenerator generator = new DateCalendarGenerator();
        System.out.println(generator.date);
        System.out.println(generator.calendar);
    }
}
