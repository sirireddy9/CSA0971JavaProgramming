class armstrong
{
public static void main(String args[])
{
int n,r,m,a=0;
n=153;
m=n;
while(m>0){
r=m%10;
a+=(r*r*r);
m=m/10;
}
if(n==a){
System.out.println("armstrong");
}else{
System.out.println("not armstrong");
}
}}
