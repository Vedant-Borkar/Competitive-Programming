import java.util.Scanner;
public class Videogamechatgpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        if (t >= 1 && t <= 100) {
            for (int i = 0; i < t; i++) {
                int X = scanner.nextInt();
                int Y = scanner.nextInt();
                int Z = scanner.nextInt();

                if (X >= 1 && X <= 100 && Y >= 5 && Y <= 100 && Z >= 5 && Z <= 15) {
                    int numberOfBreaks = X / 3;
                    int totalBreakTime = numberOfBreaks * Z;

                    if (X % 3 == 0) {
                        totalBreakTime -= Z;
                    }

                    int totalTime = (X * Y) + totalBreakTime;
                    System.out.println(totalTime);
                }
            }
        }

    }
}
