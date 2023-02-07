class Bcd 
{
	
	static void kbc(String[] args)
	{
		System.out.println("I am executable");
	}
	public static void main(String[] args)
	{
		int a = 10;
		System.out.println(a);
		System.out.println(011);
	}
}

class Abc
{
	public static void main(String[] arg)
	{
		String [] array = {"abc", "bvc"};
		Bcd.kbc(array);
		Bcd.main(array);
	}
}