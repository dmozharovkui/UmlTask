package w;

import java.util.HashSet;
import java.util.Set;

public class Company {

		private String name;
		private double budget;
		private HashSet<Employee> employees = new HashSet();
		
		 
		public Company() {
			super();
			
		}
		public  Company(String name, double budget) {
			this.name = name;
			this.budget = budget;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getBudget() {
			return budget;
		}
		public void setBudget(double budget) {
			this.budget = budget;
		}
		public void addEmployee(Employee newEmployee) {
			employees.add(newEmployee);
		}
		
		public HashSet<Employee> getEmployees() {
			return employees;
		}
		public void setEmployees(HashSet<Employee> employees) {
			this.employees = employees;
		}
		
		public SalaryService getSalaryService() {
			
			return new SalaryService();
		}
		
		@Override
		public String toString() {
			return "Company [name=" + name + ", budget=" + budget + ", employees=" + employees + "]";
		}
		
		
}
