import java.util.*;
class RabinKarpAlgo
{
	void stringMatching(String text, String pattern)
	{
		int n = text.length();
		int m = pattern.length();
		System.out.println(m + "" + n);
		int d = 256;
		int q = 101;
		int p = 0;
		int t = 0;
		int h = 1;
		//int h = 	((int) Math.pow(d, m-1) )%q;
		//System.out.println(l);
		for (int i = 0; i < m-1; i++) h = h*d % q;
		System.out.println(h);
		for (int i = 0; i < m; i++)
		{
			p = (p*d + pattern.charAt(i)) % q;
			t =	(t*d + text.charAt(i)) % q; 
		}
		System.out.println(p + " " + t);
		for (int i = 0; i <= n-m; i++)
		{
			if ( p == t) 
			{
				int j;
				//boolean flag = true;
				for (j = 0; j < m; j++)
				{
					System.out.print(text.charAt(i+j));
					if(pattern.charAt(j) != text.charAt(i+j)) 
					{
					//flag = false;
					break;}
				}
				if (j == m)
				System.out.println("Pattern found at index " + i);
			}
			 if (i < n-m)
				t = (d*(t - h*text.charAt(i)) + text.charAt(i+m)) % q;
			 if (t < 0) t = t + q;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		/*StringJoiner str = new StringJoiner(" ");
		for (int i = 0; i < args.length; i++)
		{
			str.add(args[i]);
		}
		String s1 = str.toString();*/
		System.out.println("Enter the text");
		String s1 = sc.nextLine();
		System.out.println("Enter the pattern");
		String pattern = sc.nextLine();
		RabinKarpAlgo obj = new RabinKarpAlgo();
		obj.stringMatching(s1, pattern);
	}
}