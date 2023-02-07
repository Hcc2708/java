class Test 
{
	static Test ob;
	int x = 10;
	{
		x = 15;
	}
	static {
		ob = new Test();
		ob.x = 20;
	}
	public static void main(String[] args) {
		System.out.println(ob.x);
	}
}