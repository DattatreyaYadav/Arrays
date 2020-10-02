package array;

import java.util.Scanner;

public class Reverse_with_out_second_array {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array");
		//int n=scan.nextInt();
		int array[]=new int[scan.nextInt()];
		
		System.out.println("enter the elements in to the array.");
		for(int i=0;i<array.length;i++) {
			System.out.println("element at "+(i+1)+" position is : ");
			array[i]=scan.nextInt();
		}
		scan.close();
		System.out.println("the elements present in array are :");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();

		for(int i=0;i<array.length/2;i++) 
		 {
			int temp=array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=temp;
			
		 }
	    System.out.println("ARRAY AFTER REVERSING WITH OUT USING SECOND ARRAY .");
	    for(int i=0;i<array.length;i++) {
	    	System.out.print(array[i]+" ");
	    }
	}

}
