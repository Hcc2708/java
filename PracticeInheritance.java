class A {
	int value = 3;
	}
class B extends A {
	int value = 5;
	super.value = 4;
	//value = 4; //not allowed, identifier expected. 
	//int z = value;// allowed.
	//int value = 4; // illegal forward reference -> either override the variable or only use it, meanse after using the variable override is not allowed.
	public static void main(String[] args) {
    		A obj = new A();
		B obj1 = new B();
		System.out.println(obj.value);
		//System.out.println(obj1.z);
		System.out.println(obj1.value);
	}
}
		