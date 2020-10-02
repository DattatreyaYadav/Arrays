package array;

import java.util.Scanner;

public class Maximum_minimum {

	public static void main(String[] args) {
		int []array=new int[5];
		Scanner scan=new Scanner(System.in);		  
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
		System.out.println("the maximum element of an array :");
		for(int i=0;i<array.length-1;i++) {
			if(array[i+1]>array[0]) {
				int temp =array[0];
				array[0]=array[i+1];
				array[i+1]=temp;	
			}	
		}
		System.out.println(array[0]);
		
		System.out.println("the minimum element of an array :");
		for(int i=0;i<array.length-1;i++) {
			if(array[i+1]<array[0]) {
				int temp =array[0];
				array[0]=array[i+1];
				array[i+1]=temp;	
			}	
		}
		System.out.println(array[0]);
		
	}

}
