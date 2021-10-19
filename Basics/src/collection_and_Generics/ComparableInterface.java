package collection_and_Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Stud implements Comparable<Stud>{
	int rollno,marks;
	String name;
	
	public Stud(int rollno, String name, int marks) {
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
	public int compareTo(Stud s) {
		
		return marks>s.marks?1:-1;
	}
	
}
public class ComparableInterface {

	public static void main(String[] args) {
		
		List<Stud> studs = new ArrayList<Stud>();
		studs.add(new Stud(23,"Mahesh",55));
		studs.add(new Stud(24,"Sony",64));
		studs.add(new Stud(25,"Larry",25));
		studs.add(new Stud(26,"Joseph",36));
		
		Collections.sort(studs);
		
		for(Stud s:studs) {
			System.out.println(s);
		}

	}

}
