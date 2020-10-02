package array;

import java.util.Scanner;

public class Averagearray {

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
		scan.close();
		System.out.println("the elements present in array are :");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		int sum=0;
		int averag=0;
		System.out.println("average of elements of array is ");
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		averag=sum/array.length;
        System.out.println(averag);
	}

}
