package array;

import java.util.Scanner;

public class Duplicate_values_in_array {

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
		
		System.out.println("duplicate values of an array are :");
		
		int count=0;
		
		for(int i =0;i<array.length;i++) 
		{
			for(int j=0;j<array.length;j++)
			  {
				if(j<i && array[i]==array[j])
				{
					break;
				}
				if(j==array.length-1)
				{
					break;
				}
				if(array[i]==array[j+1]) 
				{
					count=count+1;
				}
			  } 
			if(count>1)	
			System.out.print(array[i]+" ");
			count=0;
		}
	}
}
