package Chairs;

import java.time.Year;

public class Tester {
    Chair chair;

    public void sit() {
        if (this.chair == null)
            System.out.println("Нет стула");
        else
            System.out.println("Сел на " + this.chair + "\n");
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public static void main(String[] args) {
        ChairFactory factory = new ChairFactory();
        Tester tester = new Tester();

        Chair first = factory.createVictorianChair();
        tester.setChair(first);
        tester.sit();

        Chair second = factory.createMultifunctionalChair();
        tester.setChair(second);
        tester.sit();

        Chair third = factory.createMagicChair();
        tester.setChair(third);
        tester.sit();
    }
}
