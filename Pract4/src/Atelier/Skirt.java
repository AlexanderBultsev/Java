package Atelier;

public class Skirt extends Clothes implements WomenClothing{
    public Skirt(ClothesSize size, double price, String colour) {
        super(size, price, colour);
    }

    @Override
    public void dressWomen() {
        System.out.println("Юбка: " +
                "размер: " + size + ", " +
                "цвет: " + colour + ", " +
                "цена: " + price);
    }
}
