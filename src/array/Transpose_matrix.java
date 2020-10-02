package array;

import java.util.Scanner;

public class Transpose_matrix {

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
        	
        	for(int j=0;j<col;j++) 
        	{
        		System.out.print(matrix[i][j]+"   ");
        	}
        	System.out.println();
        }
        System.out.println("transpose of the above matrix.");
        for(int i=0;i<col;i++) 
        {  	
        	for(int j=0;j<rows;j++) 
        	{
        		System.out.print(matrix[j][i]+"  ");
        	}   
        	System.out.println();
        }
        scan.close();
	}

}
