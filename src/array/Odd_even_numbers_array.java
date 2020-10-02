package array;

import java.util.Scanner;

public class Odd_even_numbers_array {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array");
		
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
       
	    int even=0,odd=0;
	    System.out.println("even elements are :");
	    for(int i=0;i<array.length;i++)
	    {   
		    if(array[i]%2==0) 
		    {
			    even++; 
			    System.out.print(array[i]+" ");
		    }
	    }
	    System.out.println();
	    System.out.println("odd elements are :");
	    for(int i=0;i<array.length;i++)
	    {   
		    if(array[i]%2!=0) 
		    {
			    odd++; 
			    System.out.print(array[i]+" ");
		    }
	    }
	    System.out.println();
	    System.out.println("total number of even elements in the array are : "+even);
	    System.out.println();
	    System.out.println("total number of odd elements in the array are : "+odd);
	}

}
