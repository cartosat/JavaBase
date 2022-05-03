package control_statements;

public class BreakContinue {

	public static void main(String args[]) {
		//Break is used to stop execution when certain condition is met
		//continue skip the certain condition 
		
		for(int i=1;i<6;i++) {
			if(i==4) {
				continue;
			}
//			if(i>4) {
//				break; //Terminates loop when i is greator than 4
//			}
			System.out.println("Value is:-"+i);
		}
	}
}
