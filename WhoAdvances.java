import java.util.Scanner;
public class WhoAdvances {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n, k, i, j, count = 0, m;
        n = sc.nextInt();
        k = sc.nextInt();
        if(k>=1 && k<=50 && n>=1 && n<=50) {
            int arr[] = new int[100];
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            m=arr[k-1];
            for(i=0;i<n;i++)
            {
                if(arr[i]>=m && arr[i]>0)
                    count++;
            }
            System.out.println(count);
        }

    }
}
        /**if(k>=1 && k<=50 && n>=1 && n<=50) {
            int arr[] = new int[100];
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (i = 0; i < k; i++) {
                if (arr[i] > arr[i + k - 1] && (i + k - 1) < n) {
                    count++;
                    m = arr[i];
                    j = i;
                    while (m == arr[j]) {
                        if (arr[j] == arr[j + 1] && (j+1) < (n - 1)) {
                            count++;
                            j++;
                        } else {
                            m++;
                        }
                    }
                }

            }
            System.out.println(count);
        }
    }
}
/*if(arr[i]==arr[i+1] && i<n){
        for(int j=i+1;j<n;j++)
        {
        if(arr[j]==arr[j+1] && j<n)
        count++;
        }
        }*/