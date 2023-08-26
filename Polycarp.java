import java.util.Scanner;
public class Polycarp
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = 0, c2 = 0, rem, temp,n=0;
        n=sc.nextInt();
            do {
                n = sc.nextInt();

                rem = n % 3;
                temp = n / 3;
                if (rem == 0)
                    c1 = c2 = temp;
                else if (rem == 1) {
                    c1 = temp + 1;
                    c2 = temp;
                } else if (rem == 2) {
                    c1 = temp;
                    c2 = temp + 1;
                }
                System.out.println(c1 + " " + c2);
            } while (n != 5);

    }
}