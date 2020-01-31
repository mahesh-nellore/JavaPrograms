package javaconcepts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	private int stdid;
	private String stdname;
	
	public int getStdid() {
		return stdid;
	}

	public void setStdid(int stdid) {
		this.stdid = stdid;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public Student(int stdid, String stdname) {
		this.stdid = stdid;
		this.stdname = stdname;
	}
	
	public String toString() {
		return "Student Name::"+stdname+", Student Id::"+stdid;
	}
}
public class ComparatorExample {
	
	
	public static void main(String[] args) {
		List<Student> st = new ArrayList<Student>();
		Student s = new Student(005, "Mahesh");
		Student s1 = new Student(001, "Bharathy");
		Student s2 = new Student(003, "Senthil");
		Student s3 = new Student(002, "Rajesh");
		Student s4 = new Student(004, "Chethan");
		
		st.add(s);
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		
		Comparator<Student> com = new Comparator<Student>() {
			
			public int compare(Student st1, Student st2) {
				if(st1.getStdid() > st2.getStdid())
					return 1;
				else
					return -1;
							
				
			}
		};

		
		Collections.sort(st, com);
		
		for (Student student : st) {
			System.out.println(student);
		}
		
		

	}

}
