public class StringTest {
	public static void main(String[] args) {
	Short s1 = 9;
	Integer s2 = 3;
	float c = 3.4f;
	int d = 5;
	
	//int b = (c + d); it will be converted to float first because widenning done automatically not narrowing.
	long a = (s1 + s2); // this addition will be of integer type and will be automatically widenning.
	//Long s3 = (s1 + s2); // line n1 here it will through error because Long is wrapper class and class data type can not do widenning automatically. we need type casting for it (long)
	Long s3 = (long) (s1 + s2);
	//String s4 = (String) (s3 * s2); // line n2  // this will also through error to convert it into String we should use "" with addition.
	String s4 = "" + (s3 * s2);
	System.out.println("Sum is " + s4);
}
}