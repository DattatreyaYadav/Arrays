package array1;

public class FirstDuplicate {

	static int firstDuplicateNumber(int array[])
	{
		int min_index_position=array.length;
	    for(int i=0;i<array.length;i++)
	    {
	    	for(int j=i;j<array.length-1;j++)
	    	{
	    		if(array[i]==array[j+1])
	    		{
	    			min_index_position=Math.min(min_index_position, j+1);
	    		}
	    	}
	    }
	    if (min_index_position==array.length)
	    {
	    	return -1;
	    }
		return array[min_index_position];
	}
	public static void main(String[] args) {
		int array[]= {2,1,3,5,3,2};
		int result=firstDuplicateNumber(array);
		System.out.println("First Duplicate Number in the  given array ");
		System.out.println(result);

	}

}
