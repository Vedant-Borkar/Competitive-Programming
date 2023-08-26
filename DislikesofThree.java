import java.util.Scanner;
public class DislikesofThree {
    public static void main(String[] a)
    {
        Scanner sc=new Scanner(System.in);
        int t=0,i,j=0;
        int arr[]=new int[5000];
        for(i=1;i<=2000;i++)
        {
            if(i%3!=0 && i%10!=3)
                arr[j++]=i;
        }
        t=sc.nextInt();
        int arr1[]=new int[t];
        for(i=0;i<t;i++)
            arr1[i]=sc.nextInt();

        for(i=0;i<t;i++)
            System.out.println(arr[arr1[i]-1]);
    }
}
