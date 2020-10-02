package array;

import java.util.Scanner;

public class Symmetric_array {

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
        int matrix1[][]=new int[col][rows];
        System.out.println("transpose of the above matrix.");
        for(int i=0;i<col;i++) 
        {  	
        	for(int j=0;j<rows;j++) 
        	{ 
				matrix1[j][i]=matrix[i][j];
        	}   
        } 
        for(int i=0;i<col;i++) 
        {  	
        	for(int j=0;j<rows;j++) 
        	{ 
				System.out.print(matrix1[i][j]+" ");
        	}   System.out.println();
        }
        scan.close();
        int flag=0;
        System.out.println("is the above matrix is symmetric  or not? ");
        if(rows==col)
        {
            for(int i=0;i<rows;i++) 
            {  
        	   for(int j=0;j<col;j++) 
        	    { 
        		  if(matrix[i][j]!=matrix1[i][j]) 
        		  {
        			 flag=1;
        			 break;
        			
        		  }
        	    }
        	       if(flag==1)
                  {
                                	
                  break; 
                  }
            }
            if(flag==0) 
            {
            	System.out.println("the above matrix is symmetric");
            }
            else
            {
            	System.out.println("the above matrix is not symmetric");
            }
        }
        else 
        {
        	System.out.println("the above matrix is not symmetric");
        }
	}

}
