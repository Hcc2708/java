import java.util.*;
class ListDemo {
	public static void main(String[] args) {
		List <String> l1 = new ArrayList<>();
		l1.add("raj");
		l1.add("abc");
		l1.add(1, "chandravanshi");
		l1.add("Hemchand");
		l1.add("Chandravanshi");
		System.out.println(" using set : " + l1.set(2, "Chandravanshi"));
		System.out.println(" using remove : " + l1.remove(0));
		}
}