package Atelier;

public class TShirt extends Clothes implements MenClothing, WomenClothing  {
    public TShirt(ClothesSize size, double price, String colour) {
        super(size, price, colour);
    }

    @Override
    public void dressMen() {
        System.out.println("Мужская футболка: " +
                "размер: " + size + ", " +
                "цвет: " + colour + ", " +
                "цена: " + price);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка: " +
                "размер: " + size + ", " +
                "цвет: " + colour + ", " +
                "цена: " + price);
    }
}
