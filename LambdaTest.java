class LambdaTest
{
	public static void main(String[] args)
		{
			A ob = (p, q) -> p*q;
			System.out.println(ob.multiply(5,9));
			
			A ob2 = (p, q) -> p+q;
		}
}

@FunctionalInterface
interface A
{
	int multiply(int p, int q);
}