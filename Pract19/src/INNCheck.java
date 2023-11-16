import java.util.Scanner;

import static java.lang.Math.log10;

public class INNCheck {
    private static boolean isCorrectINN(long INN) {
        int length = (int)log10(INN) + 1;
        return length == 10 || length == 12;
    }
    public static long parseINN(String INNString) {
        try {
            long INN = Integer.parseInt(INNString);
            if (!isCorrectINN(INN)) {
                throw new INNException("Введен недействительный ИНН: " + INNString, new RuntimeException());
            }
            return INN;
        } catch (NumberFormatException e) {
            throw new INNException("Введен некоррекетный ИНН: " + INNString, e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ИНН: ");
        String INNString = scanner.next();
        try {
            long INN = parseINN(INNString);
            System.out.println("ИНН успешно определен: " + INN);
        } catch (INNException e) {
            System.out.println(e);
        }
    }
}
