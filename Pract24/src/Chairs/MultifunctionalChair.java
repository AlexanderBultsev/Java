package Chairs;

public class MultifunctionalChair extends Chair{
    int a;
    int b;

    public MultifunctionalChair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void sum() {
        System.out.printf("Стул сложил %d + %d и получил %d\n", a, b, a + b);
    }
    @Override
    public String getType() {
        sum();
        return "мультифункциональный";
    }
}
