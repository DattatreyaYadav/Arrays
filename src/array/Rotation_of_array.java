package array;
import java.util.Scanner;
public class Rotation_of_array {
	/*
	   static void leftrotation(int array[], int d)
	   {
	      for loop for rotations ---d
	      {
	      leftrotationbyone(array)
	      }  
	   }
	   leftrotationbyone(int array[])
	   {
	    int temp=array[0];
	    for loop for array length
	       array[i]=array[i+1]
	    array[i]=temp;
	    
	    after this print the array 
	   }   
	 */

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,6,7};
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number of left rotations to be done.");
		int d=scan.nextInt();
		int temp[]=new int[d];
		for(int i=0;i<temp.length;i++)
		{
			temp[i]=array[i];
		}
		for(int i =temp.length;i<array.length;i++) {
			array[i-temp.length]=array[i];
		}

		for(int i =0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
        System.out.println();
		for(int i =(array.length-d);i<array.length;i++) {
			array[i]=temp[i-(array.length-d)];
		}
		
		for(int i =0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		//leftrotation(int array[],d); here d is no of rotaions
		
       scan.close();
	}

}
