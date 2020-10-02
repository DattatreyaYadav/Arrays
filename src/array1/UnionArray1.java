package array1;

public class UnionArray1 {
	static int[] union(int array1[],int array2[]) 
	{
		int count=0;
		for(int i=0;i<array1.length;i++) 
		{
			for(int j=0;j<array2.length;j++)
			{
				if(array1[i]==array2[j])
				{
					count++;
				}
			}
		}
		int len1=array1.length;
		int len2=array2.length;
		int length=len1+len2-count;
		int array3[]=new int[length];
		int k=0;
	    for(int i=0;i<array1.length;i++)
	    {
	    	array3[k]=array1[i];
	    	k++;  	
	    }
	    for(int i=0;i<array2.length;i++)
	    {
	    	int find=0;
	    	for(int j=0;j<array1.length;j++) 
	    	{
	    		if(array2[i]==array1[j])
	    		{
	    			find=1;
	    			break;
	    		}
	    	}
	    	if(find==0)
	    	{
	    		array3[k]=array2[i];
	    		k++;
	    	}
	    }
		
		return array3;
		
	}
	public static void main(String[] args) 
	{
		int array1[]={1,2,3,4,5,6};
		int array2[]= {4,5,6,7,8,9};
	     
		System.out.println("union of two arrays :");
		int []result=union(array1,array2);
        for(int i=0;i<result.length;i++) 
        {
        	System.out.print(result[i]+" ");
        }
        System.out.println();
	}
}
