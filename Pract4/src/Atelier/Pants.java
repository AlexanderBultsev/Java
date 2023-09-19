package Atelier;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(ClothesSize size, double price, String colour) {
        super(size, price, colour);
    }

    @Override
    public void dressMen() {
        System.out.println("Мужские штаны: " +
                "размер: " + size + ", " +
                "цвет: " + colour + ", " +
                "цена: " + price);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женские штаны: " +
                "размер: " + size + ", " +
                "цвет: " + colour + ", " +
                "цена: " + price);
    }
}
