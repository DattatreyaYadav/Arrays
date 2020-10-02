/*
 GIVEA AN ARRAY NUMS IF N INNTEGERS WHERE N>1 RETURN AN ARRAY OUTPUT SUTH THAT
 OUTPUT[I] IS EQUAL TO THE PRODUCT OF ALL THE ELEMENTS OF NUMS EXCEPT NUMS[I];S
 */

package array1;

public class ProductArray 
{
	static int [] productArray(int array[])
	{
		int length=array.length;
		int array1[]=new int[length];
		for(int i=0;i<length;i++)
		{
			int product=1;
			for(int j=0;j<length;j++)
			{
			  if(i==j)
			  {
				  continue;
			  }
			  else
			  {
				  product=product*array[j];
			  }
			  array1[i]=product;
			}
		}
		return array1;
	}

	public static void main(String[] args) 
	{
		int array[]= {1,2,3,4};
	 
	    System.out.println("resultant array with production of other elements except the present index.");
	    int result[]=productArray(array);
	    for(int i=0;i<result.length;i++)
	    {
	    	System.out.print(result[i]+" ");
	    }
	    System.out.println();
	}
}

//resultant array with production of other elements except the present index.

//24 12 8 6
