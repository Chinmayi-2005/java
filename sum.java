import java.util.*;
class Sum
{
	public static void main(String args[])
	{
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		s=sc.nextLine();
		
	
		StringTokenizer t=new StringTokenizer(s);
		int sum=0;
		while(t.hasMoreTokens())
		{
			String tok=t.nextToken();
			int num=Integer.parseInt(tok);
			sum+=num;
		}
		System.out.println("sum is : "+sum);
	}
}