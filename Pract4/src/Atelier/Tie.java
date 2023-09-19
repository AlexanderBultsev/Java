package Atelier;

public class Tie extends Clothes implements MenClothing{
    public Tie(ClothesSize size, double price, String colour) {
        super(size, price, colour);
    }

    @Override
    public void dressMen() {
        System.out.println("Галстук: " +
                "размер: " + size + ", " +
                "цвет: " + colour + ", " +
                "цена: " + price);
    }
}
