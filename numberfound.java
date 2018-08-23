import java.util.Scanner;
class numberfound
{
public static void main(String[] args)
{
Scanner v=new Scanner(System.in); 
int x,n,flag=1;
int [] myarr=new int[]{1,4,6,7,8,9,10};
System.out.print("Enter the element = ");
n=v.nextInt();
for(x=0;x<myarr.length;x++)
  {
   if(myarr[x]==n)
     {
      flag=0;
     } 
  }
   if(flag==0)
     {
     System.out.println("Element Found!!");
     }
    else
    {
    System.out.println("Element not found!!");
    }
}
}