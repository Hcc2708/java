class Siblings {
	public void tempFun() 
	{
		System.out.println("hello Temporary function");
	}
}
interface B
	{
		int x = 45;
		void name();
	}
public class NestedClass {
	void createObject() 
	{
		class A extends Siblings
		{
			
			//System.out.println("abc");
		}
		
		A obj = new A();
		obj.tempFun();
		class C implements B
		{
			//static int x = 67; not allowed. 
			static final int x = 67;
			public void name() 
			{
				System.out.println("ABCDEFG");
			}
			{System.out.println("ABCDEF");
		}}
		B obja = new C();
		obja.name();
        System.out.println(obja.x);
		//return obja;  can not return object of local class
	}
	{System.out.println("check printing");}
	public static void main(String[] args) 
	{
		NestedClass obj1 = new NestedClass();
		obj1.createObject();
		//Siblings obj2 = new A(); will throw error bcs A is local class it's scope is only within that block.
		//B ojb2 = obj1.createObject(); object of local class can not be created outside of that block.
		//ojb2.name();
	}
}
	