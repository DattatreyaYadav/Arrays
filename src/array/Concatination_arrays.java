package array;

public class Concatination_arrays {

	public static void main(String[] args) {
		int []array1= {10,20,30,40};
		int []array2= {1,2,3,4,5};
		int n=array1.length;
		int m=array2.length;
		int [] array=new int[n+m];
		System.out.println("larger array before concating any array ");
		for(int i=0;i<array.length;i++)
		{
		System.out.print(array[i]+" ");
		}
		System.out.println();
		
		System.out.println("concatinating first array to larger array ");
		
		for(int i=0;i<array1.length;i++) {
			array[i]=array1[i];
		}
		for(int i=0;i<array.length;i++)
		{
		System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("concatinating second array to larger array");
		for(int i=array1.length;i<array.length;i++) {
			array[i]=array2[i-array1.length];
		}
		for(int i=0;i<array.length;i++)
		{
		System.out.print(array[i]+" ");
		}
	}

}
