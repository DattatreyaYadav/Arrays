package array1;

public class Intersection {

	static int[] intersectionarrays(int array1[],int array2[])
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
		int array3[]=new int[count];
		int k=0;
		for(int i=0;i<array1.length;i++) 
		{
			for(int j=0;j<array2.length;j++)
			{
				if(array1[i]==array2[j])
				{
					array3[k]=array1[i];
					k++;
				}
			}
		}
		return array3;
	}
	public static void main(String[] args) {
		int array1[]={1,2,3,4,5,6,};
		int array2[]= {4,5,6,7,8,9};
	     
		System.out.println("union of two arrays :");
		int []result=intersectionarrays(array1,array2);
        for(int i=0;i<result.length;i++) 
        {
        	System.out.print(result[i]+" ");
        }
        System.out.println();
	}
}



/*
 public class Intersection {
	static int[] intersection(int[] a, int[] b) {
		int[] temp = new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++) {
			boolean find = false;
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					find = true;
					break;
				}
			}
			if(find==true)
				temp[k++]=a[i];
		}
		int[] inter = new int[k];
		for(int i=0;i<k;i++)
			inter[i] = temp[i];
		return inter;
	}

	public static void main(String[] args) {
		int[] a = {10,20,30,40,50,55,60};
		int[] b = {50,55,60,40,70,80,85,90,95};
		int[] c = intersection(a,b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
}
	}
*/