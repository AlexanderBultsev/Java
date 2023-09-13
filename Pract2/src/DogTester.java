import java.util.ArrayList;

public class DogTester {
    private ArrayList<Dog> dogs = new ArrayList<>();

    public void addDog(String name, double age) {
        dogs.add(new Dog(name, age));
    }

    public static void main(String[] args) {
        DogTester tester = new DogTester();
        tester.addDog("Bob", 12);
        tester.addDog("Jo", 1);
        System.out.println(tester.dogs.get(1));
    }
}
