package Words;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Words {

    public static String getLine(String line) {
        ArrayList<String> words = new ArrayList<>(List.of(line.split(" ")));
        if (words.isEmpty())
            return "";
        if (words.size() == 1)
            return words.get(0);

        StringBuffer result = new StringBuffer();

        while (!ok(words)) {
            Collections.shuffle(words);
        }

        for (String word : words)
            result.append(word).append(" ");
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
    public static boolean ok(ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            String firstWord = list.get(i);
            char firstChar = firstWord.toLowerCase().charAt(firstWord.length() - 1);
            String secondWord = list.get(i + 1);
            char secondChar = secondWord.toLowerCase().charAt(0);
            if (firstChar != secondChar)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Pract13/src/Words/words.txt"));
        String line = scanner.nextLine().strip().replaceAll("\\s+", " ");
        System.out.println(line);

        String newline = getLine(line);
        System.out.println(newline);
    }
}
