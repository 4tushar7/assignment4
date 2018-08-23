import java.util.Scanner;
class pattern
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i;
int j;
for(i=n;i>=1;i--)
{
  for(j=1;j<=i;j++)
     {
	System.out.print("*");
     }
System.out.println();
}
}
}