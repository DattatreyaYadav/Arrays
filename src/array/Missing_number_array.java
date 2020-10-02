package array;
import java.util.Scanner;
public class Missing_number_array 
{

	public static void main(String[] args) 
	{
	
		   System.out.println("enter the size of the array .");
		   Scanner scan=new Scanner(System.in);
		   int size=scan.nextInt();
		   int array[]=new int[size];
		   System.out.println("enter elements in to the array in the range from 1 to "+(size+1));
		   for(int i =0;i<size;i++)
		   {
			   array[i]=scan.nextInt();
		   }
		   System.out.println("elements in the array are : ");
		   for(int i=0;i<size;i++) {
			   System.out.print(array[i]+" ");
		   }
		   scan.close();
		   System.out.println();
		   System.out.println("the missing number from the array is :");
		   int n=size+1;
		   int total_sum= (n*(n+1))/2;
		   for(int i=0;i<size;i++) 
		   {
			   total_sum=total_sum-array[i];
		   }
		   System.out.println(total_sum);
    }

}
