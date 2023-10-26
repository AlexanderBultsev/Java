import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(?=\\w*\\d)(?=\\w*[a-z])(?=\\w*[A-Z]).{8,}");

        String text = "ser_examplecom14";

        Matcher matcher = pattern.matcher(text);

        System.out.println(matcher.matches());
    }
}
