package array1;

import java.util.Scanner;

public class InversePermutation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=scan.nextInt();
		System.out.println("enter elements in to the array ");
		int array[]=new int[size+1];
		for(int i =1;i<=size;i++)
		{
			array[i]=scan.nextInt();
		}
		int temp[]=new int[size+1];	
		for(int i=1;i<=size;i++)
		{
			int k=array[i];
			temp[k]=i;
		}
		System.out.println("array after doing inverse permutation");
		for(int i =1;i<=size;i++)
		{
			System.out.print(temp[i]+" ");
		} 
		System.out.println();
		scan.close();
	}
}
/*
enter the size of the array
4
enter elements in to the array 
1
4
3
2
array after doing inverse permutation
1 4 3 2 
*/