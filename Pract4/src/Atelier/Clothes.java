package Atelier;

public abstract class Clothes {
    ClothesSize size;
    double price;
    String colour;

    public Clothes(ClothesSize size, double price, String colour) {
        this.size = size;
        this.price = price;
        this.colour = colour;
    }

    @Override
    public abstract String toString();
}
