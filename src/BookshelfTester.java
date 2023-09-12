public class BookshelfTester {
    public static void main(String[] args) {
        Bookshelf testShelf = new Bookshelf();
        testShelf.add(new Book("Anton", "West", 1997));
        testShelf.add(new Book("Veter", "Aoto", 1023));
        testShelf.add(new Book("Krit", "BPLA", 2010));
        System.out.println(testShelf);
        System.out.println(testShelf.earliest());
        System.out.println(testShelf.oldest());
        testShelf.sortByYear();
        System.out.println(testShelf);
    }
}
