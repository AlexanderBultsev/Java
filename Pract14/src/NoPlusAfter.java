import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoPlusAfter {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\\d+\\s\\+");

        String text = "(1 + 8) – 9 / 4";
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.find());

        text = "6 / 5 – 2 * 9";
        matcher = pattern.matcher(text);
        System.out.println(matcher.find());
    }
}
