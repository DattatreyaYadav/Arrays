
// finding longest subarray by sum
// they will be given an array and a sum we have to find the longest subarray that satisfies that sum 

package array1;

import java.util.Scanner;

public class Subarray {
	static int[] sortedArray(int array[],int sum)
	{
		int result[]=new int[2];
		int first=0;
		int last=0;
		int length=0;
		for(int i=0;i<array.length;i++)
		{   
			int temp=0;
			for(int j=i;j<array.length;j++)
			{
				temp=temp+array[j];
				if(temp==sum)
				{
					first=i+1;
					last=j+1;
					break;
				}
				else
				{
					continue;
				}
			}
			int temp1=last-first;
			if(temp1>length)
			{
				result[0]=first;
				result[1]=last;
			}
			length=temp1;
		}
		return result;
	}

	public static void main(String[] args) {
		int array[]= {1,2,3,7,5};
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the sum");
		int sum=scan.nextInt();
	    System.out.println("result array :");
	    int result[]=sortedArray(array,sum);
	    for(int i=0;i<result.length;i++)
	    {
	    	System.out.print(result[i]+" ");
	    }
	    System.out.println();	
        scan.close();
	}
}
/*
enter the sum
12
result array :
2 4 
*/