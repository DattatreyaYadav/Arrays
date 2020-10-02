package array;
import java.util.Scanner;
public class Matrix_display {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of rows.");
        int rows=scan.nextInt();
        System.out.println("enter the number of columns.");
        int col=scan.nextInt();
        int matrix[][]=new int[rows][col];
        System.out.println("enter elements in to the matrix.");
         
        for(int i=0;i<rows;i++) 
        { 
        	System.out.println("enter elements in to "+i+"th row");
        	for(int j=0;j<col;j++) 
        	{
        		matrix[i][j]=scan.nextInt();
        	}
        }
        System.out.println("display the matrix .");
        for(int i=0;i<rows;i++) 
        {  
        	System.out.println();
        	for(int j=0;j<col;j++) 
        	{
        		System.out.print(matrix[i][j]+"   ");
        	}
        	System.out.println();
        }
        scan.close();
	}

}
