import java.util.ArrayList;
import java.util.*;
class ArrayListCheck
{
	public static void main(String[] args)
	{
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Ravi");
		a1.add("Vijay");
		Iterator<String> itr = a1.iterator();
		System.out.println(itr.next());
	}
}