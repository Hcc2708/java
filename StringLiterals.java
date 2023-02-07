public class StringLiterals {
	public static void main(String[] args) {
		String str1 = "Encyclopedia";
		String str2 = "Encyclopedia";  // str1 and str2 both are pointing to the same object
		String str3 = new String("Encyclopedia"); // now str3 and str2 are poiting to different object.
		System.out.println("str1 == str2 : " + (str1 == str2));// address comparision 
		System.out.println("str1.equals(str2) : " + (str1.equals(str2)));// content comparision.
	}
}