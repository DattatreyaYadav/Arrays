package array;

import java.util.Scanner;

public class Reverse_array {

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
		System.out.println("the  reverse elements of array are :");
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]+" ");
			
		}
		}
		
	}


