import java.math.MathContext;
import java.math.BigDecimal;
public class Practice {
	public static void main(String[] args) {
		int value = Integer.parseInt(args[0]);
		Abc obj = new Abc();
		obj.write();
		double d = 3.4;
		System.out.println(d);
		double b = 3.5;
		double c = b + d;
		System.out.println(b+c);
		//MathContext mc = new MathContext(5);
		System.out.println(new BigDecimal("3.23", new MathContext(5)));
		char x = 'a';
		System.out.println(Character.toUpperCase(x));
		System.out.println(x);
		int a = 'a';
		int e = 3;
		float y = (float)a/e;
		float f = 3/4;  // here 3/4 will perform integer division first then it will be converted to float.
		System.out.println(" addition : " +y);
		System.out.println("division with integer values : " + (6/5));
		System.out.println("division with integer variable: " + (a/e));
		System.out.println("division with integer variable: " + f);
		byte [] arr = {Byte.parseByte("3"), Byte.parseByte("4"),};
		for (byte i : arr) System.out.println(i);
		//String [] arr1 = "ram"; String cannot be converted to String[]
		//for (String i : arr1) System.out.println(i);
		System.out.println(false & true);// false will be printed.
		System.out.println(4 & 5);  // 4 will be printed.
		// && operator doesn't perform and operation on numeric values.
		System.out.println(-15>>>2);
		int v = e = 3 + 4;
		char z = (int)65.1;
		System.out.println(z);
		switch(value) {
						case 1:
							System.out.println("hemchand"+5);
							break;
						case 2:
							System.out.println("hemchand"+6);
							break;
				}
		/*for (int i = 1; i < 10; i++) {
				if (i % 2 == 0) {
				continue; // transfers control to for-loop, if i is divisible by 2. 
				}
			System.out.println(i);
			}
		int j = 0;
		
		OuterLoop: while(j<10) {
					int k = 0;
					InnerLoop : while (k< 5)
							{System.out.println(k);
							 if (k == 2) break InnerLoop; k++;} j++;}*/
	}
}

class Abc {					// we can't declare these outer classes as protected or private
	void write() {
	bcd obj2 = new bcd();
	obj2.read();
	System.out.println("i am programmer");
	}
}

class bcd {
	void read() {
	System.out.println("i am reading");
	}
}