class sortArray
{
public static void main(String[] args)
{
int x;
int y;
int tempp;
int [] arr=new int[]{1,1,1,1,0,0,1,0};
for(x=0;x<arr.length;x++)
{
   for(y=x+1;y<arr.length;y++)
     {
      if(arr[x]>arr[y])
        {
          tempp=arr[x];
          arr[x]=arr[y];
          arr[y]=tempp;
        }
     }
System.out.print(arr[x]+" ");
}
}
}