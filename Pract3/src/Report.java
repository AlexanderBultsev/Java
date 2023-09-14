import java.text.Format;
import java.util.ArrayList;
import java.util.Formatter;

public class Report {
    public static String generateReport (ArrayList<Employee> employees) {
        Formatter formatter = new Formatter();
        for (Employee employee : employees) {
            formatter.format("%-20s %-10.2f\n", employee.fullname, employee.sallary);
        }
        return formatter.toString();
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Joseph Lowe", 200000));
        employees.add(new Employee("Douglas Perez", 12345.6789));
        employees.add(new Employee("William Palmer", 909));
        employees.add(new Employee("Michael Bridges", 1592843.12));
        System.out.println(generateReport(employees));
    }
}
