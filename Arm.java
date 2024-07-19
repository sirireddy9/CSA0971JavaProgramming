class Arm
{
	public static void main(String arg[])
	{
		int n,s,sum=0,m;
		n=153;
		m=n;
		while(n!=0)
		{
		  s=n%10;
		  sum+=(s*s*s);
		  n=n/10;
		}
		  if(sum==m)
		  {
                   System.out.println("its a Armstrong num");
	          }
		   else
		   {
                   System.out.println("its not a armstrong num");
	           }
		
	}
 
}