package newTask;
public class employeeTask {
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;
	import java.util.Scanner;

	class Employee {
	    private int empId;
	    private String name;
	    private double salary;

	    public Employee(int empId, String name, double salary) {
	        this.empId = empId;
	        this.name = name;
	        this.salary = salary;
	    }

	    public int getEmpId() {
	        return empId;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    @Override
	    public String toString() {
	        return "Employee{" +
	                "empId=" + empId +
	                ", name='" + name + '\'' +
	                ", salary=" + salary +
	                '}';
	    }

	    // Comparator implementations for sorting based on different attributes
	    private static final Comparator<Employee> SORT_BY_EMPID = Comparator.comparingInt(Employee::getEmpId);
	    private static final Comparator<Employee> SORT_BY_NAME = Comparator.comparing(Employee::getName);
	    private static final Comparator<Employee> SORT_BY_SALARY = Comparator.comparingDouble(Employee::getSalary);
	       

	public static void main(String[] args) {
		 List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee(101, "John Doe", 50000));
	        employees.add(new Employee(102, "Jane Smith", 55000));
	        employees.add(new Employee(103, "Mike Johnson", 60000));
	        employees.add(new Employee(104, "Anna Lee", 48000));

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Sort employees by:\n1. Employee ID\n2. Name\n3. Salary");
	        int choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                Collections.sort(employees, SORT_BY_EMPID);
	                break;
	            case 2:
	                Collections.sort(employees, SORT_BY_NAME);
	                break;
	            case 3:
	                Collections.sort(employees, SORT_BY_SALARY);
	                break;
	            default:
	                System.out.println("Invalid choice.");
	                return;
	        }

	        System.out.println("Sorted Employees:");
	        for (Employee emp : employees) {
	            System.out.println(emp);
	        }
	    
	
	}
}


