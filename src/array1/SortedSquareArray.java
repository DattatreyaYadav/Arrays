
// you have a sorted array of integers
// write a function that returns a sorted array that contains the square of those elements

package array1;

import java.util.Scanner;

public class SortedSquareArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of the array ");
		int length=scan.nextInt();
		if(length<=0)
		{
			System.out.println("Invalid input");
			System.exit(0);
		}
		int array[]=new int[length];
		
		System.out.println("enter elements into the array");
		for(int i=0;i<length;i++)
		{
			array[i]=scan.nextInt();
		}
		System.out.println("resultant array");
		
	    int result[]=sortedSquare(array);
	    for(int i =0;i<result.length;i++) 
	    {
	    	System.out.print(result[i]+" ");
	    }
	    System.out.println();
	    scan.close();
	}

	 static int[] sortedSquare(int[] array) 
	 {
		int length=array.length;
		
		for(int i=0;i<length;i++)
		{
			int temp=(int) Math.pow(array[i], 2);
			array[i]=temp;
		}
		for(int i=0;i<length-1;i++)
		{
			for(int j=0;j<length-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp1=array[j];
					array[j]=array[j+1];
					array[j+1]=temp1;
				}	
			}
		}
		return array;
	 }
}
/*
enter the size of the array 
6
enter elements into the array
-7
-3
-1
4
8
12
resultant array
1 9 16 49 64 144 
*/