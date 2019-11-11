import java.util.ArrayList;

public class Company {

	private String name;
	private Double budget;
	private ArrayList<Employee> employees = new ArrayList<>();
	private Double employeesSalary = 0.00;
	private static SalaryService salaryService;

	public Company(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBudget() {
		return this.budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	public ArrayList<Employee> getEmployees() {
		return this.employees;
	}

	public Double getEmployeesSalary() {
		return employeesSalary;
	}

	public SalaryService getSalaryService() {
		if (salaryService == null) {
			salaryService = new SalaryService();
		}
		return salaryService;
	}

	public void addEmployee(Employee employee) throws Exception {
		Double newEmployeesSalary = this.employeesSalary + employee.getSalary();
		if (newEmployeesSalary > this.budget) {
			throw new Exception();
		}
		this.employeesSalary = newEmployeesSalary;
		this.employees.add(employee);
	}

}
