import java.util.Scanner;
public class FairPlayoff {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int i = 0, t;
        int s[] = new int[4];
        t = sc.nextInt();
        while (t-- > 0) {
            for (i = 0; i < 4; i++) {
                s[i] = sc.nextInt();
            }

            if (Math.min(s[0], s[1]) > Math.max(s[2], s[3]) || Math.max(s[0], s[1]) < Math.min(s[2], s[3]))
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}