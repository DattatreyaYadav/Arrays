package array;

import java.util.Scanner;
class Right
{
	void rightRotation(int array[],int rotations)
	{
		for(int i =0;i<rotations;i++)
		{
			rightRotationsByOne(array);
		}
	}
	void rightRotationsByOne(int array[])
	{   int i;
		int length=array.length;
		int temp=array[length-1];
		for(i=length-1;i>=0;i--)
		{   
			if(i==0)
			{
             break;
			}
			else
			array[i]=array[i-1];
		}
		array[i]=temp;
	}
	void printArray(int array[])
	{
		System.out.println("rotation array : ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]);
		}
	}
}
public class RightRotation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the array size.");
		int size=scan.nextInt();
		int array[]=new int[size];
		System.out.println("enter elements in to the array .");
		for(int i =0;i<array.length;i++) 
		{
			array[i]=scan.nextInt();
		}
		System.out.println("enter number of rotations to be done ");
		int rotations=scan.nextInt();
		Right r=new Right();
		r.rightRotation(array,rotations);
		r.printArray(array);
		scan.close();
	}

}
