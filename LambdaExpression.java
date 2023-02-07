interface X 
{
	int add(int A, double B);
}

class LambdaExpression
{
	public static void main(String[] args)
	{
		
		//X obj = (int A) -> {return A*A*A;}; // allowed for one argument abstract method
		//X obj = (int A) -> {A*A*A;}; // not allowed inside the {} this should be statement not an just operation.
		//X obj = A -> A*A*A; // allowed
		//X obj = (int A, double B) -> {return (int)(A+B);}; // A+B should be type casted because the return type of
													  // add is int.
		X obj = (int A, double B) -> {int C = (int)(A+B);
									 return C;	};    // this statement is also allowed.
		//X obj = (int A, double B) -> int(A+B);
									 
		System.out.println(obj.add(4, 5));
	}
}
	