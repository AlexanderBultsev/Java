import java.io.File;
import java.util.ArrayList;

public class Files {
    ArrayList<File> files;

    public void readFiles(String path) {
        files = new ArrayList<File>();
        var dir = new File(path).listFiles();
        for (var file : dir) {
            files.add(file);
        }
    }

    public void print(int count) {
        for (int i = 0; i < files.size() && i < count; i++) {
            System.out.println(files.get(i));
        }
    }

    public static void main(String[] args) {
        Files files = new Files();
        files.readFiles("../Java");
        files.print(5);
    }
}
