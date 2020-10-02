package array1;

public class UnionArrays {

	static int[] union(int array1[],int array2[]) 
	{
		int array3[]=new int[array1.length+array2.length];
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

/*

public class Union {

	static int[] union(int[] a, int[] b) {
		int[] u = new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++) {
			u[k++]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			boolean find = false;
			for(int j=0;j<a.length;j++) {
				if(b[i]==a[j]) {
					find = true;
					break;
				}
			}
			if(find==false)
				u[k++]=b[i];
		}
		int[] uni = new int[k];
		for(int i=0;i<k;i++)
			uni[i] = u[i];
		return uni;
	}

	public static void main(String[] args) {
		int[] a = {10,20,30,40,50,55,60};
		int[] b = {50,55,60,70,80,85,90,95};
		int[] c = union(a,b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
	}

}
 */
