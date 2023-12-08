package Chairs;

public class ChairFactory implements ChairAbstractFactory{

    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(382);
    }

    @Override
    public MultifunctionalChair createMultifunctionalChair() {
        return new MultifunctionalChair(1, 2);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair("огня");
    }
}
