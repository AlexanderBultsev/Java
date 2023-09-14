import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова через пробел: ");
        String inp = scanner.nextLine();

        inp = inp.strip();
        inp = inp.replaceAll("\\s+", " ");
        System.out.println(inp);

        int count = 0;
        if (!inp.isEmpty()) {
            count++;
            for (int i = 0; i < inp.length(); i++) {
                if (inp.charAt(i) == ' ') {
                    count++;
                }
            }
        }

        System.out.printf("Введено %d слов", count);
    }
}
