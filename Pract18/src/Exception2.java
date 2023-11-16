import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Exception2 {
    public void demoException() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        String intString = scanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException ne) {
            System.out.println("Введено не целое число");
        } catch (ArithmeticException ae) {
            System.out.println("Попытка деления на ноль");
        } finally {
            System.out.println("2 / " + intString);
        }
    }


    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
        exception2.demoException();
    }
}
