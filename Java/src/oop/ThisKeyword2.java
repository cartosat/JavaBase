package oop;

class Students{
	int rollNo;
	String name;
	float fees;
	
	Students(int rollNo, String name, float fees){
		this.rollNo = rollNo;
		this.name = name;
		this.fees = fees;
	}
	
	public void show() {
		System.out.println(rollNo+" "+name+" "+fees);
	}
}
public class ThisKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students st = new Students(11,"Vaibhav",20000);
		st.show();

	}

}
