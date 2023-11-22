import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class GenericArray<T> {
    private Object[] data;
    private int size;

    public GenericArray() {
        data = new Object[0];
        size = 0;
    }

    public void add(T value) {
        size++;
        data = Arrays.copyOf(data, size);
        data[size - 1] = value;
    }

    public T get(int index) {
        if (index < 0 && -index <= size) {
            index = size + index;
        }
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T)data[index];
    }

    public ArrayList<T> toArrayList() {
        var arrayList = new ArrayList<T>();
        for (T value : (T[])data) {
            arrayList.add(value);
        }
        return arrayList;
    }

    public static void main(String[] args) {
        var generic1 = new GenericArray<Integer>();
        generic1.add(12);
        generic1.add(33);
        generic1.add(567);
        System.out.println(generic1.get(1));
        System.out.println(generic1.get(-3));

        var generic2 = new GenericArray<String>();
        generic2.add("A");
        generic2.add("Da");
        generic2.add("key");
        generic2.add("value");
        System.out.println(generic2.get(0));
        System.out.println(generic2.get(-1));

        ArrayList<String> array2 = generic2.toArrayList();
        System.out.println(array2);
    }
}
