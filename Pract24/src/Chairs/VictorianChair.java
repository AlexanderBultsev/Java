package Chairs;

public class VictorianChair extends Chair{
    int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public void getAge() {
        System.out.printf("Стулу %d лет\n", this.age);
    }
    @Override
    public String getType() {
        getAge();
        return "викторианский";
    }
}
