import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Poker {
    static ArrayList<String> generateDeck() {
        ArrayList<String> deck = new ArrayList<>();
        String[] dignities = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "T"};
        String[] suits = {"♠", "♥", "♣", "♦"};
        for (String dignity : dignities) {
            for (String suit : suits) {
                deck.add(dignity + suit);
            }
        }
        // Перемешивание колоды
        Collections.shuffle(deck, new Random());
        return deck;
    }
    public static void main(String[] args) {
        System.out.print("Введите количество игроков: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 10) {
            System.out.print("Превышено максимальное количество игроков");
            return;
        }
        ArrayList<String> deck = generateDeck();
        System.out.printf("Карты на %d игроков разложены:\n", n);
        for (int i = 0; i < n; i++) {
            System.out.printf("%s %s %s %s %s\n", deck.get(i*5), deck.get(i*5+1), deck.get(i*5+2), deck.get(i*5+3), deck.get(i*5+4));
        }
    }
}
