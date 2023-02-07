interface A {
		int x = 11;
	}
class B implements A {
	void show() { x = 22;} // we can not change the value of x here because x is public static final which golbal constent.
	}
public class InterfaceTest {
	public static void main(String[] args) {
	B obj = new B();
	obj.show();
	System.out.println(obj.x);}
	}