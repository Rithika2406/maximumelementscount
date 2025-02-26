import java.util.Scanner;
public class Main{
    public static void main(String[]args)
    {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=S.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
           if(arr[i]>max)
           {
            max=arr[i];
           } 
           
        }
        int maxcount=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==max)
            maxcount++;
     
        }
        System.out.println(maxcount);
    }
}