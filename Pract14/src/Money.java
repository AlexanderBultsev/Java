import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Money {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\\d+\\.\\d{1,2}\\s(USD|RUB|EU)");

        String text = "Список 1.21 RUB различных 34.3 USD валют 5.6 EU неправильных 0.78 RRR, 0.1231 EU, 55USD";

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
