import java.util.Scanner;
class astrong
{
public static void main(String[] args)
{
Scanner v=new Scanner(System.in);
System.out.print("Enter value of n = ");
int n=v.nextInt();
int on;
int rem;
int r=0;
on=n;
while(on!=0)
  {
   rem=on%10;
   r+=Math.pow(rem,3);
   on/=10;
  }
if(r==n)
  System.out.println("Yes!! it is an armstrong number = "+n);
else
  System.out.println("No!! it is not an armstrong number = "+n);
}
}