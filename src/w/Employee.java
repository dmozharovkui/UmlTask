package w;

public class Employee {
	private double ratePerHour;
	private Integer workdays;
	private int bonus;
	
	public Employee() {
		super();
		
	}

	public Employee(double ratePerHour, Integer workdays, int bonus) {
		this.ratePerHour = ratePerHour;
		this.workdays = workdays;
		this.bonus = bonus;
	}
	
	public double getSalary() {
		return (ratePerHour*workdays*8)+bonus;
	}
	
	@Override
	public String toString() {
		return "Employee [ratePerHour=" + ratePerHour + ", workdays=" + workdays + ", bonus=" + bonus + "]";
	}
	
	
	
}
