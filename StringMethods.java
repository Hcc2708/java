public class StringMethods {
	public static void main(String[] args) {
		String str = "http://docs.oracle.com  /javase/7/docs/api/";
		String[] splits = str.split("/", 0);
		for (String s : splits) {
			System.out.println(s);
			System.out.println(s.length());
		}
		String str1 = "h  e  m ";
		System.out.println(str1.trim());  // will eliminte only leading and trailing space.
	}
}