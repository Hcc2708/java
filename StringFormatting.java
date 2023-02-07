public class StringFormatting {
	public static void main(String[] args) {
		int iVar = -243566;
		float var = 3.4555f;
		System.out.printf("%6d%n", iVar);
		System.out.printf("%06d%n", iVar); // for empty space only 0 id allowed apart from empty.
		System.out.printf("%+06d%n", iVar);
		System.out.printf("%+,06d%n", iVar); // it will write the actual sign of variable in output like here it will print -2,435
		System.out.printf("%-,6d%n", iVar);  // -ve will appear onluy if variable is having -ve value
	}
}

public class MiddleTwoChars {  // implement this class and see the chamtkar.
	public static void main(String[] args) {
		int x = args[0].length()/2;
		System.out.println(args[0].charAt(x-1)+args[0].charAt(x)); 
	}
}

// because of character is a numeric type, in above code when we try to add two char it is adding there ascii values and printing that value.