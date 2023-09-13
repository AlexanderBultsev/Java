public class Author {
    private String name;
    private String email;
    private char gender;

    public Author (String _name, String _email, char _gender) {
        this.name = _name;
        this.email = _email;
        this.gender = _gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
