import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[a-z]+@[a-z]+(\\.[a-z]+)*");

        String text = "user@example.com, root@localhost, myhost@@@com.ru, @my.ru, home@edu.mirea.ru";

        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
