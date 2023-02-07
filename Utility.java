// java.util.Arrays 
import java.util.*;

class Utility 
{
	public static void main(String[] args)
		{ 
			int [] marks  = new int[10];
			Arrays.fill(marks, 0, 9, 10);
			for (int x : marks) 
				{ System.out.println(x)}
		}
}