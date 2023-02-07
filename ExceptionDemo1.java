class ExceptionDemo1
{
	public static void main(String[] args)
	{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		add(x,y);
		divide(x, y);
		multiply(x, y);
	}
	private static void add(int a, int b)
	{
		int res = a + b;
		System.out.println("Sum of" + a + " and"+ b + "is: " + res);
	}
	private static void divide(int a , int b)
	{
		int res = a / b;
		System.out.println("Division of " + a + " and " + b + " is: " + res);
	}
	private static void multiply(int a, int b)
	{
		int res = a * b;
		System.out.println("Multiply of " + a + " and " + b + " is " + res);
	}
}