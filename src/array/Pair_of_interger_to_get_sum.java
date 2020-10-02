/* Write a java program to find all pairs of elements in an integer array
 *  whose sum is equal to a given number?
 */



package array;

import java.util.Scanner;

public class Pair_of_interger_to_get_sum {

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
		
		System.out.println("the elements present in array are :");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("enter a number to find out it's sum. ");
		int sum=scan.nextInt();
		scan.close();
		for(int i=0;i<array.length;i++) 
		{
			for(int j=i+1;j<array.length;j++) 
			{
				if(array[i]+array[j]==sum)
				{
					System.out.println("the pairs are "+array[i]+"+"+array[j]+"="+sum);
				}
			}
		}

	}

}
