public class SalaryService {

	public SalaryService() {
		System.out.println("Service created");
	}

	public void pay(Company company) {
		System.out.println("Salary paid. Total sum: " + company.getEmployeesSalary());
	}

}
