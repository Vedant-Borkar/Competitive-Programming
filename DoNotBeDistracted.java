import javax.crypto.NullCipher;
import java.util.Scanner;
public class DoNotBeDistracted {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t,n,i,j=0,count=0;
        t= sc.nextInt();
        while(t-->0)
        {
            n= sc.nextInt();
            String str=sc.next();
            if(n>=1 && n<=50) {
                char arr1[]=new char[n];
                char arr2[]=new char[n];
                for(i=0;i<str.length();i++)/**STRING TO CHAR ARRAY CONVERSION**/
                {
                    arr1[i]=str.charAt(i);
                }
                arr2[j]=arr1[0];
                for(i=0;i<n;i++)
                {
                    while(arr2[j]!=arr1[i])
                        arr2[++j]=arr1[i];
                }
                /**for(i=0;i<=j; i++)
                    System.out.print(" "+arr2[i]);**/
                for(i=0;i<=j;i++)
                {
                   char m=arr2[i];
                    for(int k=i+1;k<=j;k++)
                        if(m==arr2[k])
                            count++;
                }
            }
            if(count>0)
                System.out.println("NO");
            else
                System.out.println("YES");

            count=0;j=0;
        }
    }
}
/**for(i=0;i<n; i++)
 System.out.print(" "+arr2[i]);**/