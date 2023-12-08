package Chairs;

public class MagicChair extends Chair{
    String magic;

    public MagicChair(String magic) {
        this.magic = magic;
    }

    public void doMagic() {
        System.out.println("Стул наделал магии " + magic);
    }
    public String getType() {
        doMagic();
        return "магический";
    }
}
