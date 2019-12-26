import java.util.HashSet;
import java.util.Set;

//Find Duplicate character in string
class JavaOops{
	
	public static void main(String args[]) {
	
	String name = "dgyugpajkjddyunsna";
	char[] conarray = name.toCharArray();
	
	Set<Character> set = new HashSet<Character>();
	
	for(Character character : conarray) {
		
		if(!set.add(character)) {
			System.out.println(character);
		}
		
	}
	
}	
}                                       




















































/*
 * interface Emp{
 * 
 * void employeeDetails(int id); }
 * 
 * class Employee implements Emp{
 * 
 * public void employeeDetails(int id) {
 * 
 * System.out.println("Im a compassite EMployee"); }
 * 
 * public void employeeDetails(String name, float salary) {
 * System.out.println(name + " " + salary); }
 * 
 * String empname = "";
 * 
 * public String getEmpname() { return empname; }
 * 
 * public void setEmpname(String empname) { this.empname = empname; }
 * 
 * 
 * }
 * 
 * class JavaOops extends Employee{
 * 
 * public void employeeDetails(String name, int salary) {
 * System.out.println(name + " " + salary); }
 * 
 * public static void main(String[] args) {
 * 
 * JavaOops java = new JavaOops(); java.employeeDetails("Priya", 100000);
 * java.employeeDetails(12); java.setEmpname("Vamsi"); String in =
 * java.getEmpname(); System.out.println(in); }
 * 
 * }
 */