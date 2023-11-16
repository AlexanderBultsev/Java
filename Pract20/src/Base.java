import java.io.Serializable;

public class Base<K extends Integer, V, D extends String> {
    private K key;
    private V value;
    private D description;

    public Base(K key, V value) {
        this.key = key;
        this.value = value;
        this.description = (D)"";
    }

    public Base(K key, V value, D description) {
        this.key = key;
        this.value = value;
        this.description = description;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public D getDescription() {
        return description;
    }

    public void setDescription(D description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Base { " +
                "key = " + key +
                ", value = " + value +
                ", description = " + description +
                " }";
    }

    public String info() {
        return "Base < " +
                key.getClass().getName() + ", " +
                value.getClass().getName() + ", " +
                description.getClass().getName() +
                " >";
    }

    public static void main(String[] args) {
        Base<Integer, String, String> base = new Base<>(12, "base");

        System.out.println(base);

        System.out.println(base.info());

        base.setDescription("sunbase");

        System.out.println(base);
    }
}
