import java.util.Scanner;
public class Juicy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] weights = new int[n];

        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }

        int result = SmallDiff(weights);
        System.out.println(result);
    }

    private static int SmallDiff(int[] weights) {
        int totalWeight =0;
        for(int i=0;i<weights.length;i++)
            totalWeight=totalWeight+weights[i];
        int halfTotal = totalWeight / 2;

        boolean[] dp = new boolean[halfTotal + 1];
        dp[0] = true;

        for (int i = 0; i <weights.length; i++) {
            int weight = weights[i];
            for (int j = halfTotal; j >= weight; j--) {
                dp[j] = dp[j] || dp[j - weight];
            }
        }

        int closestWeight = 0;
        for (int i = halfTotal; i >= 0; i--) {
            if (dp[i]) {
                closestWeight = i;
                break;
            }
        }

        return Math.abs(totalWeight - 2 * closestWeight);
    }
}
/** on test case 2
 *Output: Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
 * at Rextester.findSmallestDifference(source.java:25)
 * at Rextester.main(source.java:16)*/