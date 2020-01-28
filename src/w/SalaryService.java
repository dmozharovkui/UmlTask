package w;

import java.util.HashSet;
import java.util.Set;

public class SalaryService {

	public void pay(Company company) {
		
		for(Employee emp:company.getEmployees()) {
			if(company.getBudget()>0) {
				company.setBudget(company.getBudget()-emp.getSalary());
				
				
				if(company.getBudget()<0) {
					System.out.println("We not have a money  " + emp + " :(");
					break;
				}
				System.out.println(emp+" got a money");
				System.out.println("Company had" + company.getBudget() +" money");
			}
			
			
		}
	}
}
