package String;

public interface Stringable {

    public static int length (String string) {
        return string.length();
    }

    public static String sub(String string, int count, int start) {
        return string.substring(start, start + count);
    }

    public static String revers(String string) {
        String result = "";
        for (int i = 0; i < length(string); i++) {
            result = sub(string, 1, i) + result;
        }
        return result;
    }

    public static void main(String[] args) {
        String string = "tester";
        System.out.println(length(string));
        System.out.println(sub(string, 3, 3));
        System.out.println(revers(string));
    }
}
