import java.util.*;
class bank
{
    public static void main(String args[])
    {
    int i,size,ta=0;
    Scanner s=new Scanner(System.in);
    System.out.println("enter size");
    size=s.nextInt();
    int[]data1=new int[size];
    int[]data2=new int[size];
    for(i=0;i<size;i++)
    {
        System.out.println("enter denomination"+(i+1)+ ":");
        data1[i]=s.nextInt();
        System.out.println("enter no of notes"+(i+1)+ ":");
        data2[i]=s.nextInt();
    }
    
    for(i=0;i<size;i++)
    {
        ta+=data1[i]*data2[i];                              
        
    }
    System.out.println(ta);
}
}