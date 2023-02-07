public class AdditionOverloading {
	void add(int x, int y) {
		System.out.println("Sum of " + x + " and " + y + " : " + (x + y));
	}
	void add(int x, float y) {
		System.out.println("Sum of " + x + " and " + y + " : " + (x + y));
	}
	void add(float x, float y) {
		System.out.println("Sum of " + x + " and " + y + " : " + (x + y));
	}
	int add(float x, double y, double z) {
		System.out.println("Sum of " + x + ", " + y + " and " + z + " : " + (x + y + z)); return 0;
	}
	public static void main(String[] args) {
		AdditionOverloading obj = new AdditionOverloading();
		obj.add(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		obj.add(Float.parseFloat(args[2]), Float.parseFloat(args[3]));
		obj.add(Integer.parseInt(args[1]), Float.parseFloat(args[3]));
		obj.add(Float.parseFloat(args[2]), Double.parseDouble(args[4]), Double.parseDouble(args[5]));
	}
}