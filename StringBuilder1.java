class StringBuilder1
{
	public static void main(String[] args) 
	{
		StringBuilder sb1 = new StringBuilder("hello");
		System.out.println(sb1.capacity());
		sb1.append("hcc");
		System.out.println(sb1.capacity());
		StringBuilder sb = new StringBuilder(5);
		sb.append("hcc");
		System.out.println(sb.capacity());
		sb.append("chan");
		System.out.println(sb.capacity());
		sb.append("Hemchand chandravanshi");
		System.out.println(sb.capacity());
		sb.ensureCapacity(28);
		System.out.println(sb.capacity());
		sb.ensureCapacity(30);
		System.out.println(sb.capacity());
		sb.ensureCapacity(123);
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		//sb = "hemchand"; // error
		sb = new StringBuilder("hemchand");
		String str1 = sb.toString();
		String str = new String("hemchand");
		System.out.println(str.equals(str1));
		sb.replace(0,1, "H");
		System.out.println(sb);
		//sb.toUpperCase(); not there
		System.out.println(sb);
	}
	public String toString() { return "hemchand chandravanshi b tech";}
}