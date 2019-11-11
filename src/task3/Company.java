package prj02;

import java.util.ArrayList;

public class Company {

	private String name;
	private Double budget;
	private ArrayList<Employee> employees = new ArrayList<Employee>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void addEmployee(Employee em) {
		employees.add(em);
	}

	public SalaryService getSalaryService() {

	}

}
