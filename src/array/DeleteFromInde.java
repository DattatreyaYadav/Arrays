package array;

public class DeleteFromInde {

	static int[] deleteArr(int array[],int index)
	{
		int array1[]=new int[array.length-1];
		if(index<0||index>array.length)
		{
			System.out.println("index is not in range ");
			return null;
		}
		else 
		{
			for(int i=0;i<array.length-1;i++) 
			{
				if(i<index)
				{
					array1[i]=array[i];
				}
				else
				{
					array1[i]=array[i+1];
				}
			}
		}
		return array1;
	}
	public static void main(String[] args) {
		int ar[]={23,45,65,43,21,78};
		System.out.println("Before delete");
		for(int i=0;i<ar.length;i++)
		System.out.print(ar[i]+" ");
		ar=deleteArr(ar,2);
		if(ar==null)
		System.out.println("\n deletion is faild");
		else
		{
		System.out.println("\nafter delete");
		for(int i=0;i<ar.length;i++)
		System.out.print(ar[i]+" ");
		}
	}
}
