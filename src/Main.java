import java.util.Arrays;

public class Main {
    public static void reverse( String[] arrray) {
        int n = arrray.length;
        for (int i = 0; i < n / 2; i++) {
            String t = arrray[i];
            arrray[i] = arrray[n-i-1];
            arrray[n-i-1] = t;
        }
    }
    public static void main(String[] args) {
        // String array
        String[] array = {"Aa", "Bb", "Cc", "Dd", "Ee", "Ff"};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
        String[] array2 = {"Aa", "Bb", "Cc", "Dd", "Ee", "Ff", "Gg"};
        System.out.println(Arrays.toString(array2));
        reverse(array2);
        System.out.println(Arrays.toString(array2));

    }
}
