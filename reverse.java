import java.util.Scanner;
class reverse
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter the integer :- ");
int n=s.nextInt();
int revr=0;
int rd;
while(n!=0)
{
rd=n%10;
revr=revr*10+rd;
n/=10;
}
System.out.println("Reversed number is = "+revr);
}
}