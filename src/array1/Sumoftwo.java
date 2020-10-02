//addition of element from each array has satisfied the sum ?
package array1;

public class Sumoftwo {

	static boolean sumTwoNumbers(int array1[],int array2[],int sum)
	{
		int flag=0;
		for(int i=0;i<array1.length;i++)
		{
			int temp=0;
		
			for(int j=0;j<array2.length;j++)
			{
				temp=array1[i]+array2[j];
				if(temp==sum)
				{
				 flag=1;
				 break;
				}
			}
		}
	    if(flag==1)
	    	return true;
	    else
	    	return false;
	}
	public static void main(String[] args) {
		int array1[]= {1,2,3};
		int array2[]= {10,20,30,40,50};
		int sum=42;
		boolean result=sumTwoNumbers(array1,array2,sum);
		if(result)
		{
			System.out.println("addition of element from each array has satisfied the sum");
		}
		else
		{
			System.out.println("not possible");
		}
	}
}
/*
{1,2,3}
{10,20,30,40}
sum=42

2+40=42;

possible;
*/