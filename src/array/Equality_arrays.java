/* 
  java program to check the equality of two arrays
 */



package array;

import java.util.Scanner;

public class Equality_arrays {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of first array .");
		//int n=scan.nextInt(); 
		int array[]=new int[scan.nextInt()];
		
		System.out.println("enter the size of second array .");
		int array1[]=new int[scan.nextInt()];
		if(array.length==array1.length) 
		{
          System.out.println("LENGHTS ARE EQUAL ,PREOCESSED FUTHER .");
		}
		else 
		{
			System.out.println("ARRAYS ARE NOT EQUAL.");
			System.exit(0);
		}
		System.out.println("enter the elements in to first array.");
		for(int i=0;i<array.length;i++) {
			System.out.println("element at "+(i+1)+" position is : ");
			array[i]=scan.nextInt();
		}
		
		
		System.out.println("enter the elements in to second array.");
		for(int i=0;i<array1.length;i++) {
			System.out.println("element at "+(i+1)+" position is : ");
			array1[i]=scan.nextInt();
		}
		System.out.println("the elements present in first array are :");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		System.out.println("the elements present in second arrayarray are :");
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		scan.close();
	    int temp=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==array1[i])
			{
				temp++;
				continue;
			}
			break;
		}
		if(temp==array.length) {
			System.out.println("ARRAYS ARE EQUAL OF HAVING SAME IDENTICAL ELEMENTS");
		}
		else {
			System.out.println("ARRAYS ARE NOT EQUAL.");
		}
			
			
		}
	}


