package array;

import java.util.Scanner;

public class ProductSubArray {
     static void productSubArray(int array[])
     {
    	 int product=1;
    	 int length=array.length;
    	 for(int i=0;i<length;i++)
    	 {
    		 for(int j=i;j<length;j++)
    		 {
    			 for(int k=i;k<=j;k++) 
    			 {
    				 product=product*array[k];
    			 }
    		 }
    	 }
    	 System.out.println("product of all subarray of a given array is : "+ product);
     }
	 
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the array size.");
		int size=scan.nextInt();
		int array[]=new int[size];
		System.out.println("enter elements in to the array .");
		for(int i =0;i<array.length;i++) 
		{
			array[i]=scan.nextInt();
		}
		productSubArray(array);
		scan.close();
	}

}
