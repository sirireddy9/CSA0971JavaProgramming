class Perfect
{
	public static void main(String arg[])
	{
		int i,n,sum=0;
		n=12;
		for(i=1;i<=n;i++)
		if(n%i==0)
		{
		sum=sum+i;
		}
		if(sum==n){
		System.out.println("perfect number");
		}
                else{
		System.out.println("not perfect number");
		}
		
	}
 
}