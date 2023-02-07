public class MultiDimArrayPrinter {
	static int[][] int2DArr =  new int[3][2];
	

	public static void main(String[] args) {
		/*int c;
		System.out.println(c);*/ will through compilation error.
		int[][] int2DArr1 =  new int[3][];// we can't declare static variable inside methods.
		/*{
							{1},
							{2, 3},
							{4, 5, 6},
							{7, 8, 9, 10}
						};*/
		System.out.println(int2DArr1[0]);// this will print null
		//System.out.println(int2DArr[0][0]);// this won't print 0 because we have not even created empty array

		int2DArr1[0] = new int[2];
		System.out.println(int2DArr1[0][0]);// now this will print 0

			for (int[] arr : int2DArr) {
				System.out.println(arr);
			for (int value : arr) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
}