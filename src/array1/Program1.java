package array1;

public class Program1 {

	public static void main(String[] args) 
	{
		
				int a[]={3,14,5,6,5,14,2,14,6};
					
					int big=a[0];
					for(int i=1;i<a.length;i++)
					{
						if(big<a[i])
							big=a[i];
					}
				int c[]=new int[big+1];

				for(int i=0;i<a.length;i++)
				{

					c[a[i]]++;
				}

				for(int i=0;i<c.length;i++)
				{
					if(c[i]!=0)
					System.out.println(i+"--> "+c[i]);
				}
			}
}
