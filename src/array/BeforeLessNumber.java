package array;

import java.util.Scanner;

public class BeforeLessNumber {
	static void beforeLessNumber(int []array)
	{
		int length=array.length;
		int []array1=new int[length];
		for(int i=0;i<length;i++)
		{
			if(i==0)
			{
				array1[i]=-1;
				continue;
			}
			else
			{
				for(int j=i;j>=0;j--)
				{
					if(array[j]<array[i])
					{
						array1[i]=array[j];
						break;
					}
					else if(j>0)
					{
						continue;
					}
					else
					{
						array1[i]=-1;
					}
				}
			}
		}
		System.out.println("array which is modified is : ");
		for(int i=0;i<length;i++)
		{
			System.out.print(array1[i]+" ");
		}
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
		beforeLessNumber(array);
        scan.close();
	}
}
