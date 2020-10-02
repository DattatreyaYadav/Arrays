package array;

import java.util.Scanner;

public class ZeroToEnd 
{   
	static void zerosToEnd(int array[])
	{
		int length=array.length;
		for(int i=0;i<length;i++)
		{ 
			if(array[i]>0)
			{
				continue;
			}
			else 
			{
				for(int j=i;j<length;j++)
				{
					if(array[j]==0)
					{
					  continue;
					}
					else
					{
					  int temp=array[i];
					  array[i]=array[j];
					  array[j]=temp;
					  break;
					}
			    }
			}
		}
		System.out.println("array with zero at end position .");
		for(int i=0;i<length;i++)
		{
			System.out.print(array[i]);
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
		zerosToEnd(array);
        scan.close();
	}

}
