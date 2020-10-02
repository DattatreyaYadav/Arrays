package array1;

import java.util.Scanner;

public class FirstNonDuplicate {

	static char firstNonDuplicateCharacter(String s)
	{
		for(int i =0;i<s.length();i++)
		{
			boolean duplicate=false;
			for(int j =0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j)&& i!=j)
				{
					duplicate=true;
					break;
				}
			}
			if(!duplicate) return s.charAt(i);
		}
		return '-';
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("enter the String : ");
	    String s=scan.nextLine().toLowerCase().trim();
	    System.out.println("first Duplicate character in the given string");
	    char result=firstNonDuplicateCharacter(s);
	    System.out.println(result);
	    scan.close();
	}

}
