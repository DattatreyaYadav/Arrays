package array;

import java.util.Scanner;

public class Sum_average_diagonalsum_elements_matrix {

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
        
        int sum=0;
        System.out.println();
        System.out.println("sum of elements of the matrix .");
        for(int i=0;i<rows;i++) 
        { 
        	for(int j=0;j<col;j++) 
        	{
        	   sum = sum+matrix[i][j];
        	}
        }
        System.out.println(sum);
        System.out.println();
        int n=rows+col;
        System.out.println("average of elements of array is ");
        float average= sum/n;
        System.out.println(average);
        
        System.out.println();
        int diagonal_sum=0;
        System.out.println("diagonal sum of matrix elements ");
        for(int i=0;i<rows;i++) 
        { 
        	for(int j=0;j<col;j++) 
        	{
        	   if(i==j)
        	   {
        	   diagonal_sum=diagonal_sum+matrix[i][j];
        	   }
        	}
        }
        System.out.println(diagonal_sum);
	}

}
