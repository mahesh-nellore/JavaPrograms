package javaconcepts;
import java.util.Iterator;
import java.util.PriorityQueue;

class EmpDetails implements Comparable<EmpDetails>{
	private int empid;
	private String empname;
	
	public EmpDetails(int empid, String empname) {
		this.empid = empid;
		this.empname = empname;
	}
	
	@Override
	public int compareTo(EmpDetails o) {
		if(empid > o.empid)
			return 1;
		else if (empid < o.empid)
			return -1;
		return 0;
	}
	
	public String toString() {
		return "Employee Name ::"+empname+", EmployeeId::"+empid;
	}
	
	
}
public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<EmpDetails> pq = new PriorityQueue<>();
		EmpDetails emp = new EmpDetails(005, "Mahesh");
		EmpDetails emp1 = new EmpDetails(001, "Senthil");
		EmpDetails emp2 = new EmpDetails(003, "Bharathy");
		EmpDetails emp3 = new EmpDetails(002, "Rajesh");
		EmpDetails emp4 = new EmpDetails(004, "Chethan");
		
		System.out.println(emp);
		
		pq.add(emp);
		pq.add(emp1);
		pq.add(emp2);
		pq.add(emp3);
		pq.add(emp4);
		
		Iterator<EmpDetails> itr = pq.iterator();
		while(itr.hasNext()) {
			System.out.println(pq.poll());
			//System.out.println(itr.next());
			
			
		}

	}

}

