package Chairs;

public interface ChairAbstractFactory {
    VictorianChair createVictorianChair();
    MultifunctionalChair createMultifunctionalChair();
    MagicChair createMagicChair();
}
