package array1;

import java.util.Scanner;

public class BinaryArraySorting {

	public static void main(String[] args) {
	
	   Scanner scan=new Scanner(System.in);
	   System.out.println("length :");
	   int length=scan.nextInt();
	   int array[]=new int[length];
	   System.out.println("enter elements in to the array ");
	   for(int i=0;i<length;i++)
	   {
		   array[i]=scan.nextInt();
	   }
	   int result[]=binarySorting(array);
	   System.out.println("after binary array sorting :");
	   for(int i=0;i<array.length;i++)
	   {
		   System.out.print(result[i]+" ");
	   }
	   System.out.println();
	   scan.close();
	}
     public static int[] binarySorting(int array[])
     {
    	 int count0=0,count1=0;
    	 for(int i=0;i<array.length;i++)
    	 {
    		 if(array[i]==0)
                count0++;
    		 else
    			 count1++;
    	 }
    	 for(int i =0;i<count0;i++)
    	 {
    		 array[i]=0;
    	 }
    	 for(int i=count0;i<count0+count1;i++)
    	 {
    		 array[i]=1;
    	 }
    	 return array;
     }
}
/*
 length :
6
enter elements in to the array 
1
0
1
0
1
0
after binary array sorting :
0 0 0 1 1 1 
*/
