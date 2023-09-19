package Atelier;

import java.util.ArrayList;

public class Atelier{
    public void dressMen(ArrayList<Clothes> clothes) {
        System.out.println("Вся мужская одежда:");
        for (Clothes thing : clothes) {
            if (thing instanceof MenClothing) {
                ((MenClothing)thing).dressMen();
            }
        }
    }
    public void dressWomen(ArrayList<Clothes> clothes) {
        System.out.println("Вся женская одежда:");
        for (Clothes thing : clothes) {
            if (thing instanceof WomenClothing) {
                ((WomenClothing)thing).dressWomen();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Clothes> clothes = new ArrayList<>();
        clothes.add(new TShirt(ClothesSize.XS, 1299, "красный"));
        clothes.add(new Pants(ClothesSize.S, 3099, "синий"));
        clothes.add(new Skirt(ClothesSize.M, 4299, "белый"));
        clothes.add(new Tie(ClothesSize.L, 999, "черный"));

        Atelier atelier = new Atelier();
        atelier.dressMen(clothes);
        System.out.println();
        atelier.dressWomen(clothes);
    }
}
