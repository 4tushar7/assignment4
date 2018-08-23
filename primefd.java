import java.util.Scanner;
class primefd
{
public static void main(String[] args)
{
Scanner v=new Scanner(System.in);
System.out.print("Enter value of n =");
int n=v.nextInt();
int x;
int nmr;
int c;
for(nmr=1;nmr<n;nmr++)
   {
     c=0;
     for(x=2;x<=nmr/2;x++)
        {
        if(nmr%x==0)
         {
         c++;
         break;
         }
        }
   if(c==0 && nmr!=1)
     {
     System.out.print(nmr+" ");
     }	
   }
}
}