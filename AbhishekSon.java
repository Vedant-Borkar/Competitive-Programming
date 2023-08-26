import java.util.*;
public class AbhishekSon {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t,x,h;
        t=sc.nextInt();
        if (t>=1 && t<=1000){
            while(t-->0)
            {
                x=sc.nextInt();
                h=sc.nextInt();
                if(x>=1 && h<=100)
                {
                    if(x>=h)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
            }
        }
    }
}
