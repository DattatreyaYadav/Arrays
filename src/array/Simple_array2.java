package array;

public class Simple_array2 {

	public static void main(String[] args) {
		// different ways of declaring 1D arrays .
		//int array[]= {10,20,30,40,50};
		//int [] array=new int[5];
		int [] array=new int[] {10,20,30,40,50};
		//int array[]=new int[5];
		System.out.println("the elements present in array are :");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
	}

}
