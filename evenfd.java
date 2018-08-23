import java.util.Scanner;
class evenfd
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter value of n = ");
int n=s.nextInt();
int x;
for(x=1;x<n;x++)
   {
     if(x%2==0)
      System.out.print(x+" ");
   }

}
}