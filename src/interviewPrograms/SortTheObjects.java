package interviewPrograms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
	String empname;
	int empid;
	
	public Employee(String empname, int empid) {
		this.empname = empname;
		this.empid = empid;
		System.out.println(empid+"  "+empname);
	}
}
public class SortTheObjects {

	public static void main(String[] args) {
		List<Employee>list = new ArrayList<Employee>();
		Employee emp1 = new Employee("Priya", 1987);
		Employee emp2 = new Employee("Mahesh", 1986);
		Employee emp3 = new Employee("Vijwal", 2016);
		Employee emp4 = new Employee("Vamsi", 1985);
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		
		
		Collections.sort(list, (e1,e2)->e1.empid>e2.empid?1:-1);
		list.stream().forEach(e->System.out.println(e.empid+"----> "+e.empname));

	}

}
