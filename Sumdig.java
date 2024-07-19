class Sumdig
{
	public static void main(String arg[])
	{
		int n,rev=0,s,sum=0,m;
		n=1234;
		m=n;
		while(n!=0)
		{
		  s=n%10;
		  rev=rev*10+s;
		  n=n/10;
		  sum+=s;
		}
		System.out.println("sum of digits is"+sum);
	}
 
}