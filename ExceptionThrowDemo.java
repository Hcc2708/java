class ExceptionThrowDemo 
{
	public static void main(String[] args) 
	{
		try 
		{
			method();
			System.out.println("control in try block");
		} catch(InvalidException e)
		{ System.out.println("Control in catch block");}
	}
	static void method() throws InvalidException
	{
		Thread.sleep(2000);
		throw new InvalidException();
		System.out.println("control in method function");
	}
	
}

class InvalidException extends Exception
{
	public InvalidException()
		{ }
}