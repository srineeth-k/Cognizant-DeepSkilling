class Employee {
    private final String employeeId;
    private final String name;
    private final String position;
    private final double salary;

    public Employee(String employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    
    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId +
                ", name=" + name +
                ", position=" + position +
                ", salary=" + salary + "]";
    }
}

class EmployeeManagement {
    private Employee[] employees;
    private int count;

    public EmployeeManagement(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    public boolean addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count++] = employee;
            return true;
        }
        System.out.println("Employee array is full. Cannot add more employees.");
        return false;
    }

    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public boolean deleteEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                employees[i] = employees[count - 1];
                employees[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        EmployeeManagement empManager = new EmployeeManagement(10);

        Employee emp1 = new Employee("E001", "Srineeth", "Manager", 95000);
        Employee emp2 = new Employee("E002", "Karthik", "Developer", 60000);
        Employee emp3 = new Employee("E003", "Varun", "Manager", 155000);

        empManager.addEmployee(emp1);
        empManager.addEmployee(emp2);
        empManager.addEmployee(emp3);

        System.out.println("Employee List:");
        empManager.traverseEmployees();
        Employee searchResult = empManager.searchEmployee("E002");
        System.out.println("\nSearch Result for E002:");
        System.out.println(searchResult != null ? searchResult : "Employee not found");
        boolean deleteResult = empManager.deleteEmployee("E001");
        System.out.println("\nDelete Result for E001:");
        System.out.println(deleteResult ? "Employee deleted" : "Employee not found");
        System.out.println("\nEmployee List after deletion:");
        empManager.traverseEmployees();
    }
}