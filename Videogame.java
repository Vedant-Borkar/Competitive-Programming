import java.util.Scanner;
class Videogame
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int x,y,z,t,time=0;

            t = s.nextInt();
        if(t<=100 && t>=1) {
            while (t-- > 0) {
                x = s.nextInt();
                y = s.nextInt();
                z = s.nextInt();
                if(x<=100 && x>=1 && y<=100 && y>=5 && z<=15 && z>=5) {
                    if (x >=3) {
                        while (x > 3) {
                            x = x - 3;
                            time = time + 3 * y + z;
                        }
                    }
                    if (x== 1 || x==2 || x==3)
                        time = time + x * y;

                    System.out.println(time);
                    time = 0;
                }
            }
        }
    }
}
