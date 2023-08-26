import java.util.Scanner;
class Jumping
{
    public static void main(String[] a)
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        long sum=0;
        while(sum<n)
        {
            sum=sum+1;
            if(sum>=n)
                break;
            sum=sum+2;
            if(sum>=n)
                break;
            sum=sum+3;
        }
        if(sum==n)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}