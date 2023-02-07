import java.util.*;
public class HashMapMethodsDemo {
	public static void main(String[] args) {
		Map <String, String> namesMap = new LinkedHashMap <String, String>();

		// add given (key, values) to Map
		namesMap.put("Jan", "January");
		namesMap.put("Feb", "February");
		namesMap.put("Mar", "March");
		namesMap.put("Apr", "April");


		System.out.println("namesMap = " + namesMap);
		namesMap.put("Feb", "Fabulous");  // values of Feb will change but the order of entris will remain same.
		// change the value February to Fabulous

		// observe the change in the output the value for the particular key is updated.
		
		System.out.println("namesMap = " + namesMap);
	}
}