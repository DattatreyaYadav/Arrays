package array1;

import java.util.Scanner;

public class BitDifference {
	
	public static String binary(int number)
	{
		String temp="";
//		while(number>0)
//		{
//			if(number==1)
//			{
//				int rem=number%2;
//				temp="0"+rem;
//				number=number/2;
//			}
//			else
//			{
//			   int rem=number%2;
//			   temp=rem+""+temp;
//			   number=number/2;
//			}
//		}
		
		
		return temp;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of an array ");
		int size=scan.nextInt();
		int array[]=new int[size];
		System.out.println("enter the elements into the array ");
		for(int i=0;i<size;i++)
		{
			array[i]=scan.nextInt();
		} 
		int count=0;
        for(int i=0;i<size-1;i++)
        {
        	for(int j=i+1;j<size;j++)
        	{
//        		String first=binary(array[i]);
//        		String second=binary(array[j]);
//        		while(first.length()>0)
//        		{
//        			for(int k=0;k<first.length();k++) {
//        			if(first.charAt(k)!=second.charAt(k))
//        			{
//        				count++;
//        			}
//        			}
//        		}
        	}
        }
        for(int i=size-1;i>1;i--)
        {
        	for(int j=i-1;j>0;j--)
        	{
//        		String first=binary(array[i]);
//        		String second=binary(array[j]);
//        		while(first.length()>0)
//        		{
//        			for(int k=0;k<first.length();k++) {
//        			if(first.charAt(k)!=second.charAt(k))
//        			{
//        				count++;
//        			}
//        			}
//        		}
        	}
        }
        
        System.out.println(count);
        scan.close();
	}
}
