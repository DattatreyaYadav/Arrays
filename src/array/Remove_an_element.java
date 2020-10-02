package array;

import java.util.Scanner;

public class Remove_an_element {

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
		
		System.out.println("enter the indexof element to  be remove : ");
		int remove_index=scan.nextInt();
	    
		if(array.length==0||remove_index<0 || remove_index>=array.length) {
	    	System.out.println(" YOU HAVE ENTERED WRONG INDEX . ");
	    }
	    
		int []array1=new int[array.length-1];
	    for(int i=0,k=0;i<array.length;i++) {
	    	if(i==remove_index) {
	    		continue;
	    	}
	    	array1[k++]=array[i];
	    	//k++;
	    }
	    for(int i=0;i<array1.length;i++) 
	    {
	    	System.out.print(array1[i]+" ");
	    }
	    scan.close();
	}

}
