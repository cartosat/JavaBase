package oop;
/*Encapsulation --> Binding data with methods
 * we can implement Encapsulation using Getters and Setters
 * 
 */
class Student{
	private int rollno;
	private String name;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setRollno(22);
		s1.setName("Vaibhav");
		System.out.println(s1.getName());
		System.out.println(s1.getRollno());		

	}

}
