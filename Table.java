import java.util.*;

class Employee {
    private String empId;
    private String name;
    private int age;
    private int salary;

    public Employee(String empId, String name, int age, int salary) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return empId + "  " + name + "  " + age + "  " + salary;
    }
}

public class Table {
    public static void main(String[] args) {
        List<Employee> employeeData = new ArrayList<>();
        employeeData.add(new Employee("161E90", "Ramu", 35, 59000));
        employeeData.add(new Employee("171E22", "Tejas", 30, 82100));
        employeeData.add(new Employee("171G55", "Abhi", 25, 100000));
        employeeData.add(new Employee("152K46", "Jaya", 32, 85000));

        System.out.println("Sorting options:");
        System.out.println("1. Age");
        System.out.println("2. Name");
        System.out.println("3. Salary");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sorting option (1, 2, or 3): ");
        int sortOption = scanner.nextInt();

        switch (sortOption) {
            case 1:
                Collections.sort(employeeData, Comparator.comparingInt(Employee::getAge));
                break;
            case 2:
                Collections.sort(employeeData, Comparator.comparing(Employee::getName));
                break;
            case 3:
                Collections.sort(employeeData, Comparator.comparingInt(Employee::getSalary));
                break;
            default:
                System.out.println("Invalid sorting option");
                break;
        }
        System.out.println("\nSorted Employee Data:");
        for (Employee employee : employeeData) {
            System.out.println(employee);
        }
    }
}
