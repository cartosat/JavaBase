package collection_and_Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Student implements Comparable<Student>{
	int rollno,marks;
	String name;
	
	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student s) {
		
		return marks>s.marks?1:-1;
	}
	
}
public class ComparableInterface {

	public static void main(String[] args) {
		
		List<Student> studs = new ArrayList<Student>();
		studs.add(new Student(23,"Mahesh",55));
		studs.add(new Student(24,"Sony",64));
		studs.add(new Student(25,"Larry",25));
		studs.add(new Student(26,"Joseph",36));
		
		Collections.sort(studs);
		
		for(Student s:studs) {
			System.out.println(s);
		}

	}

}
