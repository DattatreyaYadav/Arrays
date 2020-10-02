package array;
import java.util.Scanner;
public class Search_an_element {

	public static void main(String[] args) {
		int []array= {1,2,3,4,5,6,7,8};
		System.out.println("the given array is: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the element to be searched .");
		int key = scan.nextInt();
		scan.close();
		int flag=0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]==key) {
				System.out.println("the element "+key+" is found in the given array .");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("the element "+key+"is not found in the given array .");
		}
	}

}
