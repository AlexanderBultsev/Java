public class Person {
    StringBuffer lastName;
    StringBuffer firstName;
    StringBuffer middleName;

    public Person(String lastName) {
        this.lastName = new StringBuffer(lastName);
        this.firstName = new StringBuffer();
        this.middleName = new StringBuffer();
    }
    public Person(String lastName, String firstName) {
        this.lastName = new StringBuffer(lastName);
        this.firstName = new StringBuffer(firstName);
        this.middleName = new StringBuffer();
    }
    public Person(String lastName, String firstName, String middleName) {
        this.lastName = new StringBuffer(lastName);
        this.firstName = new StringBuffer(firstName);
        this.middleName = new StringBuffer(middleName);
    }

    public String shortLFM() {
        StringBuffer lfm = new StringBuffer(lastName);
        if (!firstName.isEmpty()) {
            lfm.append(" ").append(firstName.charAt(0)).append(".");
        }
        if (!middleName.isEmpty()) {
            lfm.append(middleName.charAt(0)).append(".");
        }
        return lfm.toString();
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName=" + lastName +
                ", firstName=" + firstName +
                ", middleName=" + middleName +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("Иванов", "Иван", "Иванович");
        System.out.println(p1.shortLFM());
        System.out.println(p1);
        System.out.println();

        Person p2 = new Person("Петров", "Петр");
        System.out.println(p2.shortLFM());
        System.out.println(p2);
        System.out.println();

        Person p3 = new Person("Сидоров");
        System.out.println(p3.shortLFM());
        System.out.println(p3);
    }

}
