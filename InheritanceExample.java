public class InheritanceExample {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println("a1.getAValue() : " + a1.getAValue());
		B b = new B();
		System.out.println("b.getBValue() : " + b.getBValue());
		System.out.println("b.getAValue() : " + b.getAValue());
		A a2 = b;
		System.out.println("a2.getAValue() : " + a2.getAValue());
	}
}
class A {
	public int aValue = 2;
	protected int getAValue() {
		return aValue;
	}
}
class B extends A {
	public int bValue = 3;
	public int getBValue() {
		return bValue;
	}
	public int getAValue() {  //  we can not reduce access privilages while overriding but we can increase that.
		return aValue;		
	}
	int getAValue(int aValue) {
		return 2 * aValue;
	}
}