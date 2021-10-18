package intermediate_concepts;
/*
 * Threding using Interface.
 * Runnable is interface that used here.
 * 
 */

class Hii implements Runnable{
	public void run() {
		for(int i =0;i<5;i++) {
			System.out.println("Hiii..");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
}
class Hellow implements Runnable{
	public void run() {
		for(int i =0;i<5;i++) {
			System.out.println("Hellow..");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
}

public class ThreadingUsingInterface {

	public static void main(String[] args) {
		Runnable ob1 = new Hii();
		Runnable ob2 = new Hellow();
		
		Thread t1 = new Thread(ob1);
		Thread t2 = new Thread(ob2);
		
		t1.start();
		t2.start();

	}

}
