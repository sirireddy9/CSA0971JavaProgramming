class pyramid
{
	public static void main(String arg[])
	{
		int i,j,k,rows=7;
		for(i=0;i<=rows;i++){
		for(j=i;j<rows;j++){
		 System.out.print(" ");
		}
		for(k=1;k<=(2*i-1);k++){
		 System.out.print("*");
		}
		 System.out.println();
		}
	}
}
