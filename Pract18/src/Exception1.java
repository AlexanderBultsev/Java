public class Exception1 {
    public void demoException() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException exception)      {
            System.out.println("Попытка деления на ноль");
        }
    }

    public static void main(String[] args) {
        Exception1 exeption1 = new Exception1();
        exeption1.demoException();
    }
}
