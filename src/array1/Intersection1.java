package array1;

public class Intersection1 {

	public static void intersection(int array1[],int array2[])
	{
		int arr1[]=sorting(array1);
		int arr2[]=sorting(array2);
		int length1=array1.length;
		int length2=array2.length;
		int length=0;
		if(length1>length2)
		{
			length=length2;
		}
		else if(length1<length2)
		{
			length=length1;
		}
		else
		{
			length=length2;
		}
	    int result[]=new int[length];
	    int k=0;
	    for(int i=0;i<arr1.length;i++)
	    {
	    	if(i>=1)
	    	{
	    		if(arr1[i]==arr1[i-1])
	    		{
	    			continue;
	    		}
	    	}
	    	for(int j=0;j<arr2.length;j++)
	    	{
	    		if(arr1[i]==arr2[j])
	    		{
	    			result[k]=arr2[j];
	    			k++;
	    		}
	    	}
	    }
	    int finalresult[]=new int[result.length];
	    int l=0;
	    int i=0;
	    for(i=1;i<result.length;i++)
	    {
	    	if(result[i-1]!=result[i])
	    	{
	    		finalresult[l]=result[i-1];
	    		l++;
	    	}	    	
	    }
	    finalresult[l]=result[i-1];
	    
	    for(int m=0;m<finalresult.length;m++)
	    {
	    	System.out.print(finalresult[m]+" ");
	    }
	}
	static int[] sorting(int array[])
	{
	  int n=array.length;
	  for(int i=0;i<n-1;i++)
	  {
		  for(int j=0;j<n-i-1;j++)
		  {
			  if(array[j]>array[j+1]) 
			  {
				  int temp=array[j];
				  array[j]=array[j+1];
				  array[j+1]=temp;
			  }
		  }
	  }
	  return array;
	}
	
	public static void main(String[] args) {
		int array[]= {1,4,3,5,6,2,2,3,5};
		int array1[]= {1,3,4,1,3,2,2};
        intersection(array,array1);
	}

}
