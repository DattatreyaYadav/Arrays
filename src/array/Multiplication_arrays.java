package array;

import java.util.Scanner;

public class Multiplication_arrays {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of rows for 1st matrix.");
        int rows=scan.nextInt();
        System.out.println("enter the number of columns for 1st matrix.");
        int col=scan.nextInt();
        int matrix[][]=new int[rows][col];
        System.out.println("enter elements in to the 1st matrix.");
         
        for(int i=0;i<rows;i++) 
        { 
        	System.out.println("enter elements in to "+i+"th row");
        	for(int j=0;j<col;j++) 
        	{
        		matrix[i][j]=scan.nextInt();
        	}
        }
        System.out.println("display the 1st matrix .");
        for(int i=0;i<rows;i++) 
        {  
        	System.out.println();
        	for(int j=0;j<col;j++) 
        	{
        		System.out.print(matrix[i][j]+"   ");
        	}
        	System.out.println();
        }
        System.out.println("enter the number of rows for 2nd matrix.");
        int rows1=scan.nextInt();
        System.out.println("enter the number of columns for 2nd matrix.");
        int col1=scan.nextInt();
        int matrix1[][]=new int[rows][col];
        System.out.println("enter elements in to the 2nd matrix.");
         
        for(int i=0;i<rows1;i++) 
        { 
        	System.out.println("enter elements in to "+i+"th row");
        	for(int j=0;j<col1;j++) 
        	{
        		matrix1[i][j]=scan.nextInt();
        	}
        }
        System.out.println("display the 2nd matrix .");
        for(int i=0;i<rows1;i++) 
        {  
        	System.out.println();
        	for(int j=0;j<col1;j++) 
        	{
        		System.out.print(matrix1[i][j]+"   ");
        	}
        	System.out.println();
        }
        scan.close();
        
        System.out.println("multiplication of two matrixes");
        int matrix2[][]=new int[rows][col1];
        if(col==rows1) {
        	for(int i=0;i<rows;i++) 
            {  
            	for(int j=0;j<col1;j++) 
            	{
            		matrix2[i][j]=0;
            		for(int k=0;k<col;k++)
            		{
            		matrix2[i][j]= matrix2[i][j] + matrix[i][k]*matrix1[k][j];
            		}
            		System.out.print(matrix2[i][j]+"  ");
            	}
            	System.out.println();
            }
        	
        }
        else 
         {
           System.out.println("multiplication is not possible for the given arrays.");	
         }
	}

}
