package array;
import java.util.Scanner;
public class Sumarray {
public static void main (String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the size of array");
	int array[]=new int[scan.nextInt()];
	
	System.out.println("enter the elements in to the array.");
	for(int i=0;i<array.length;i++) {
		System.out.println("element at "+(i+1)+" position is : ");
		array[i]=scan.nextInt();
	}
	scan.close();
	System.out.println("the elements present in array are :");
	for(int i=0;i<array.length;i++) {
		System.out.print(array[i]+" ");
	}
	System.out.println();
	int sum=0;
	System.out.println("sum of elements of array is ");
	for(int i=0;i<array.length;i++) {
		sum=sum+array[i];
	}
	System.out.println(sum);
	}
}
 
/*
public class Exercise2 {
public static void main(String[] args) {      
int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int sum = 0;

for (int i : my_array)
    sum += i;
System.out.println("The sum is " + sum);
}
}
*/
/*
  import java.util.Scanner;
public class Sumarray {
public static void sum(int length) {
	int array[]=new int[length];
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the elements in to the array.");
	for(int i=0;i<array.length;i++) {
		System.out.println("element at "+(i+1)+" position is : ");
		array[i]=scan.nextInt();
	}
	scan.close();
	System.out.println("the elements present in array are :");
	for(int i=0;i<array.length;i++) {
		System.out.print(array[i]+" ");
	}
	System.out.println();
	int sum=0;
	System.out.println("sum of elements of array is ");
	for(int i=0;i<array.length;i++) {
		sum=sum+array[i];
	}
	System.out.println(sum);
}
public static void main (String[] args) {
	sum(9);
	}
	}
 */


