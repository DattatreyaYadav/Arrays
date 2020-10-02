package array;

import java.util.Scanner;

public class Sum_substraction_two_array {

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
        int sum,sub;
        
        if((rows==rows1) && (col==col1) ) 
        {
         System.out.println("sum of two matrixes .");
        	for(int i=0;i<rows;i++) 
            {  
            	for(int j=0;j<col;j++) 
            	{
            		sum=(matrix[i][j]+matrix1[i][j]);
            		
            		System.out.print(sum+"  ");
            	}
            	System.out.println();
            	sum=0;
            }
        	
          System.out.println("substraction of two matrixes .");
         
              for(int i=0;i<rows;i++) 
               {  
          	      for(int j=0;j<col;j++) 
          	       {
          		     sub=(matrix[i][j]-matrix1[i][j]);
          		
          		      System.out.print(sub+"  ");
          	       }
                 	System.out.println();
          	        sub=0;
              }
        }
        else 
        {
        	System.out.println("sum of two matrixes is not possible .");
        }
        
	}

}
