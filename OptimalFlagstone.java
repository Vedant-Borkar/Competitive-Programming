import java.util.Scanner;
public class OptimalFlagstone {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n, m, a, nm, a1=0,a2=0;
    n = sc.nextLong();
    m = sc.nextLong();
    a = sc.nextLong();
    if(n>=1 && m>=1)
    {
        while(n>0)
        {
            n=n-a;a1++;
        }
        while(m>0)
        {
            m=m-a;a2++;
        }
        System.out.println(a1*a2);
    }

}}
    /**nm=n*m;
    if(n>=1 && m>=1)
    {
        if(n>a && m>a)
        {
            while(nm>=area)
            {
                ++count;
                area=count*a*a;
            }
            if(count%2==1)
            count=count+1;

        }
        else
        {
            while(nm>=area)
            {
                ++count;
                area=count*a*a;
            }
        }
    }
        System.out.println(count);
}
}
/**do {
 ++count;
 }while(nm>=(count*a*a));**/