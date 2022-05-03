package intermediate_concepts;
/*
 * Inside process we have small units called threads.
 * Why Threads:-
 * 			1) Use complete power of CPU.
 * 			2) Async task in Android.
 * 			3) Use all cores of CPU.
 * When class extends 
 */
class Hi extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hii");
			try{Thread.sleep(400);} catch(Exception e) {}
		}
	}
}

class Hello extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
			try{Thread.sleep(400);} catch(Exception e) {}
		}
	}
	
}
public class MultiThreading {

	public static void main(String[] args) throws InterruptedException {
		Hi obj = new Hi();
		Hello obj2 = new Hello();
		
		obj.start();
		Thread.sleep(50);
		obj2.start();

	}

}
