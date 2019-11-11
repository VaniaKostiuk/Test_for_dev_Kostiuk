public abstract class Employee {

	private Double ratePerHour;
	private Integer workdays;

	public Employee(Double ratePerHour, Integer workdays) {
		this.ratePerHour = ratePerHour;
		this.workdays = workdays;
	}

	public Double getRatePerHour() {
		return ratePerHour;
	}

	public void setRatePerHour(Double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

	public Integer getWorkdays() {
		return workdays;
	}

	public void setWorkdays(Integer workdays) {
		this.workdays = workdays;
	}

	public Double getSalary() {
		return this.ratePerHour * this.workdays * 8;
	}
}
