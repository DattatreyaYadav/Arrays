package array1;

public class CommonElements
{
   static void commonElements(int array1[],int array2[],int array3[])
   {
	   int i=0,j=0,k=0;
	   while(i<array1.length && j<array2.length && k<array3.length)
	   {
		 if(array1[i]==array2[j]&&array2[j]==array3[k])
		 {
			 System.out.println(array1[i]+"  ");
			 i++;
			 j++;
			 k++;
		 }
		 else if(array1[i]<array2[j])
		 {
			 i++;
		 }
		 else if(array2[j]<array3[k])
		 {
			 j++;
		 }
		 else
		 {
			 k++;
		 }
	   }
		   
   }
  // for doing this problem the arrays should be in sorted order 
  // else we have to sort those and compare to find common elements
	public static void main(String[] args) 
	{
		int ar1[] = {1, 5, 10, 20, 40, 80}; 
        int ar2[] = {6, 7, 20, 80, 100}; 
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}; 
        System.out.println("common elements are : ");
        commonElements(ar1,ar2,ar3);
	}
}
