class Rev
{
	public static void main(String arg[])
	{
		int n,rev=0,s;
		n=1234;
		while(n!=0)
		{
		  s=n%10;
		  rev=rev*10+s;
		  n=n/10;
		}
		System.out.println("reversed num"+rev);
	}
 
}