package prj02;

public class Employee {

	private Double retePerHour;
	private Integer workdays;

	public double getRetePerHour() {
		return retePerHour;
	}

	public void setRetePerHour(Double retePerHour) {
		this.retePerHour = retePerHour;
	}

	public Integer getWorkdays() {
		return workdays;
	}

	public void setWorkdays(Integer workdays) {
		this.workdays = workdays;
	}

	public Double getSalary() {
		return retePerHour * workdays * 8;
	}
}
