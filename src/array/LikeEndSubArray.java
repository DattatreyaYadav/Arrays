package array;

import java.util.Scanner;

public class LikeEndSubArray {
	static void  likeEndSubArray(int array[]) 
	{
		int length=array.length;
		int count=0;
		for(int i =0;i<length;i++)
		{ 
			for(int j=i;j<length;j++)
			{
				if(j==length-1)
				{
					break;
				}
				else if (array[i]==array[j+1])
				  {
					count=count+1;
				  }
				else
				{
					//pending
				}
				
			}
		}
		System.out.println(count);
		
	}

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
		likeEndSubArray(array); 
        scan.close();
	}

}
