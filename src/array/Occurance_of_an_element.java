package array;

import java.util.Scanner;

public class Occurance_of_an_element {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of an array.");
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
					 break;
				if(array[j]==array[i]) 
				{
					count=count+1;	
				}
				if(j==array.length-1) {
					System.out.println("the array element "+array[i]+" has occured "+count+" times.");
				}
				
			  }
			
			count=0;
		}

	}

}
