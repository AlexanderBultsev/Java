import java.util.ArrayList;
import java.util.Scanner;

public class CompShopTester {
    public static void main(String[] args) {
        CompShop testShop = new CompShop();
        testShop.addComputer("Lenovo G55", "AMD Ryzen 5900", "AMD Radeon 650", 32000);
        testShop.addComputer("Zento MS78", "Zento MX 7200", "Zento GX 4300", 13999);
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 1; i++) {
            System.out.println("Введите название модели");
            String model = scanner.nextLine();
            System.out.println("Введите название процессора");
            String cpu = scanner.nextLine();
            System.out.println("Введите название видеокарты");
            String gpu = scanner.nextLine();
            System.out.println("Введите цену");
            double price = scanner.nextDouble();
            testShop.addComputer(model, cpu, gpu, price);
            System.out.println("Компьютер учспешно добавлен в магазин");
        }
        System.out.println(testShop);
        ArrayList<Computer> testComputer = testShop.findComputer("Zento MS78", "Zento MX 7200", "Zento GX 4300");
        System.out.println(testComputer);
    }
}
