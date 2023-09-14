import java.util.ArrayList;
import java.util.Locale;

public class Employee {
    String fullname;
    double sallary;

    public Employee(String fullname, double sallary) {
        this.fullname = fullname;
        this.sallary = sallary;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }
}
