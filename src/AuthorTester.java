public class AuthorTester {
    public static void main(String[] args) {
        Author testAutor = new Author("Bob", "bob@gmail.com", 'm');
        System.out.println(testAutor);
        testAutor.setEmail("bob2@yandex.com");
        System.out.println(testAutor);
    }
}
