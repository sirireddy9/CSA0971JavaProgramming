import java.util.*;
class countsi
{
    public static void main(String[] args)
    {
        int upper=0,lower=0;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the lower range");

        lower=input.nextInt();
        System.out.println("enter the upper range");
        upper=input.nextInt();
        for(int i=lower;i<=upper;i++) 
{ 
    System.out.println("("+i+","+(i*i)+")"+" "); 
} 
}
}