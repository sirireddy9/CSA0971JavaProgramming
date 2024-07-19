class Palindrome
{
	public static void main(String arg[])
	{
		int n,rev=0,s,m;
		n=11211;
		m=n;
		while(n!=0)
		{
		  s=n%10;
		  rev=rev*10+s;
		  n=n/10;
		}
		  if(m==rev)
		  {
                   System.out.println("its a palindrome");
	          }
		   else
		   {
                   System.out.println("its not a palindrome");
	           }
		
	}
 
}