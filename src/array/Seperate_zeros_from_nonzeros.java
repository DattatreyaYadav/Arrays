package array;

import java.util.Scanner;

public class Seperate_zeros_from_nonzeros {

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
		int j=0;
		int [] array1=new int[array.length];
		for(int i=0;i<array.length;i++) 
		{    
			if(array[i]!=0) 
			{
			    array1[j]=array[i];
			    j++;
			}
			else 
			{
			  continue;
			}
		}
		System.out.println("ARRAY OF SEPERATED NON_ZEROS AND ZEROS .");
	    for(int i=0;i<array1.length;i++) 
	    {
		  System.out.print(array1[i]+" ");
		}
		
	}

}
