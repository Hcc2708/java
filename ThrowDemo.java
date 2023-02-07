class InvalidNumberException extends Exception
{}

class TooLargeNumberException extends RuntimeException
{}

class ThrowsDemo
{
	static void verify(int num) throws InvalidNumberException, TooLargeNumberException // now its responsibility of main method to handle this error.
	{
		System.out.println("Verified..");
		//throw new InvalidNumberException();
	}
 	public static void main(String[] args) //throws InvalidNumberException  // now its responsibility of JVM to handle this.
	{
	 	try {
			verify(10);
			System.out.println("its gets executed"); 
		}
		catch (InvalidNumberException e) // this will executed if error will actually thrown
		{
			System.out.println(e);
		}
	}
}