package Atelier;

public class TShirt extends Clothes {

    public TShirt(ClothesSize size, double price, String colour) {
        super(size, price, colour);
    }

    public String toString() {
        return "Футболка: " +
                "размер: " + size + ", " +
                "цвет: " + colour + ", " +
                "цена: " + price;
    }
}
