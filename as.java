import java.util.Scanner;
class armstrong
{
    public static void main(String args[])
    {
        int num,rem,temp,res=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        num=s.nextInt();
        temp=num;
        while(temp>0)
        {
            rem=temp%10;
            res+=(rem*rem*rem);
            temp=temp/10;
    }
    if(num==res)
    {
    System.out.println("armstrong");
    }
    else
    {
        System.out.println("not armstrong");
    }
}}