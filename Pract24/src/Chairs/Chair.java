package Chairs;

public abstract class Chair {
    public abstract String getType();
    @Override
    public String toString() {
        return getType() + " стул";
    }
}
