public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 4;
		int b = 0;
		try {
			int c = a / b;
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurred" + e.getMessage());
		}
		
		}
		/*public String toString() 
		{
			return "Arithmetic Exception occurred ";
		}*/
}

