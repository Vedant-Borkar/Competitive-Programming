import java.util.Scanner;
public class OddSet {
    public static void main(String[] a)
    {
        Scanner sc=new Scanner(System.in);
        int t,n,oc=0,ec=0,i;
        t=sc.nextInt();
        if(t>=1 && t<=100) {
            while (t-- > 0) {
                n = sc.nextInt();
                if (n >= 1 && n <= 100) {
                    int arr[] = new int[2 * n];
                    for(i=0;i<(2*n);i++)
                    {
                        arr[i]=sc.nextInt();
                    }
                    for(i=0;i<(2*n);i++)
                    {
                        if(arr[i]%2==0)
                            ec++;
                        else
                            oc++;
                    }
                    if(ec==oc)
                        System.out.println("Yes");
                    else
                        System.out.println("No");
                    ec=oc=0;

                }
            }
        }
    }
}
