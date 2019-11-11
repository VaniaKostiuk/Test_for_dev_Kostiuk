public class Developer extends Employee {

	private Double bonus = 0.00;

	public Developer(Double ratePerHour, Integer workdays) {
		super(ratePerHour, workdays);
	}

	public Developer(Double ratePerHour, Integer workdays, Double bonus) {
		super(ratePerHour, workdays);
		this.bonus = bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	@Override
	public Double getSalary() {
		return super.getSalary() + this.bonus;
	}
}
