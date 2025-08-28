package Names;

public class Employee {
    static String companyName = "ABC Pvt Ltd";
    String empName;
    int empId;

    Employee(String name, int id) {
        empName = name;
        empId = id;
    }

    void display() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Abhi", 101);
        Employee e2 = new Employee("Lama", 102);
        Employee e3 = new Employee("Dikshyanta", 103);

        e1.display();
        e2.display();
        e3.display();

        Employee.companyName = "XYZ Technologies";

        System.out.println("After changing company name:");
        e1.display();
        e2.display();
        e3.display();
    }
}
