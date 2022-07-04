package basics;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  bit -> 4 bit = 1 Nibble -> 8 bit = 1 byte -> 1024 byte = 1 KB -> 1024 KB = 1 MB
		//  (Mega Byte) MB -> (GiGa) GB -> (Tera) TB -> (Peta) PB -> (Hexa) HB -> (Zeeta) ZB.

		byte a2 = -12;  // 1 Byte --> 8bits --> -128 to 127
		
		short a1 = 5;  // 2 Bytes --> used for small no to 
					   // to avaoid memory wastage
					  //  -32768 to 32767
		
		int a = 50_000; // 4 Bytes --> 32 Bits
						// _ can be used it has no impact 
		
		int $a=4;       // $ can be used at start
		
		
		float c1 = 5.5f; //need to cast using f
						// 4 bytes
		
		double c = 5.5; // 8 Bytes
		
		long a3 = 121213; //8 byte
		
		
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(c);
		System.out.println(c1);
		
	}

}
