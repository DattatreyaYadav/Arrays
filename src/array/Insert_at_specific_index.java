package array;

import java.util.Scanner;

public class Insert_at_specific_index {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array");
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
		
		
		int array1[]=new int[array.length+1];
		System.out.println("enter the element to be inserted.");
		int element=scan.nextInt();
		System.out.println("enter the position for insertion .");
		int pos=scan.nextInt();
		if(pos<0 || pos>=array1.length) {
			System.out.println("element can't be inserted at specified index position .");
			System.exit(0);
		}
		else 
		{
			for(int i=0;i<pos;i++) 
			{
               array1[i]=array[i];				
			}
			
			array1[pos]=element;
			
			for(int i=pos+1;i<array1.length;i++)
			{
				array1[i]=array[i-1];
			}			
	  }
		for(int i =0;i<array1.length;i++) {
			System.out.println("array1["+i+"] = "+array1[i]);
		}
		scan.close();
	}

}
