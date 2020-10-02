package array;

import java.util.Scanner;

public class Second_largest_number {

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
		System.out.println("the sorted array : ");
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) 
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}	
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("the second largest number is :" +array[array.length-2]);
		
	}

}
