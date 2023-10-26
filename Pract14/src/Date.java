import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("(0[1-9]|[12][0-9]|3[0-1])/(0[1-9]|1[0-2])/(19[0-9]{2}|[2-9][0-9]{3})");

        String text = "30/04/2003, 01/01/2003 30-04-2003, 1/1/1899 12/12/1899 13/04/9999 32/04/2012";

        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
