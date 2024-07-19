import java.util.*;
class reverse{
public static void main(String arg[]){
String a, b="";
int i;
Scanner sc = new Scanner(System.in);
System.out.println("enter a string:");
a=sc.nextLine();
for(i=a.length()-1;i>=0;i--){
b+=a.charAt(i);
}
System.out.println("Reverse:");
System.out.println(b);
}
}