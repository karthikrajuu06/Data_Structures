package java8fetures;
import java.util.ArrayList;
class Employee{
	int emp_id;
	String emp_name;
	
	public Employee(int emp_id,String emp_name) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + "]";
	}
}

public class EmployeeDemo {
	public static void main(String [] args) {
		
		ArrayList <Employee> al = new ArrayList<>();
		al.add(new Employee(123,"prabhaa"));
		al.add(new Employee(118,"Darling "));
		al.add(new Employee(111,"Salaar"));
		al.add(new Employee(121,"Mirchii"));
		System.out.println(al);
	} 

}
