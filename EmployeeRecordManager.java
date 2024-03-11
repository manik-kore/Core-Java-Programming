package String_Operations;
import java.util.HashSet;
import java.util.Iterator;

class Employee {
    private int employeeId;
    private String employeeName;

    // Constructors, getters, and setters

    @Override
    public int hashCode() {
        return employeeId; // Using employeeId for simplicity
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employee employee = (Employee) obj;
        return employeeId == employee.employeeId;
    }

    
    
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
    
    
}

public class EmployeeRecordManager {
    public static void main(String[] args) {
        HashSet<Employee> employeeSet = new HashSet<>();

        // Add employees to the HashSet
        Employee emp1 = new Employee(1, "John Doe");
        Employee emp2 = new Employee(2, "Jane Doe");
        Employee emp3 = new Employee(1, "John Doe"); // Duplicate employee ID

        employeeSet.add(emp1);
        employeeSet.add(emp2);
        employeeSet.add(emp3);

        // Display the unique employee records
        System.out.println("Employee Records:");
        Iterator<Employee> iterator = employeeSet.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println("Employee ID: " + employee.getEmployeeId() + ", Employee Name: " + employee.getEmployeeName());
        }
    }
}
