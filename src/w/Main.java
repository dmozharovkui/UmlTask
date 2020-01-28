package w;

public class Main {

	public static void main(String[] args) {
		Company company = new Company("Test_Company",3500.0);
		Employee manager = new Employee(20.50,5,0);
		Employee developer = new Employee(30.00,5,300);
		Employee scrum_Master = new Employee(50.00,4,0);
		company.addEmployee(manager);
		company.addEmployee(developer);
		company.addEmployee(scrum_Master);
		company.getSalaryService().pay(company);;
		
	}

}
