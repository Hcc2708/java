class StringBuilderDemo
{

	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		StringBuilder sb1 = new StringBuilder(5);
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		sb.append("Hello");
		
	}
}