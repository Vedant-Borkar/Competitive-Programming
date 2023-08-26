import java.util.Scanner;
class JumpingFinal {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        long n, i;
        n = sc.nextLong();

        if (n % 3 == 0 || n % 3 == 1)
            System.out.println("yes");
        else if(n%3==2)
            System.out.println("no");
    }
}