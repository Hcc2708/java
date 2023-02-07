import java.util.*;
import java.text.*;
class UtilityDemo
{
	public static void main(String[] args) throws ParseException
	{
		int [] arr = new int[5];
		Arrays.fill(arr, 0, 5, 20);  // 
		for (int x : arr) System.out.println(x);
		SimpleDateFormat df =  new SimpleDateFormat("yy-MMM-dd");
		//Date d = df.parse(args[0]);
		Date d = new Date();
		String str = df.format(d);
		System.out.println(str);
	}
}