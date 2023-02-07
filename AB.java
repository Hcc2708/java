class AB
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
		sb1.append("Helloe");
		System.out.println(sb1.capacity());
		//sb1.append("Hello JAVA PR");
		//System.out.println(sb1.capacity());
		/*sb1.append("Hello JAVA PROGRAMMING"); // extra space will be created after filling the remaining space.
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		sb1.ensureCapacity(29); // if it will less then or equal to existing capacity nothing will happen
		System.out.println(sb1.capacity());
		sb1.ensureCapacity(58);
		System.out.println(sb1.capacity());*/
		/*sb1.insert(5, "hemchand");*/
		sb1.replace(6, 8, "hemc");
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
	}
}