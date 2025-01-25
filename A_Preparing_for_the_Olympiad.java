import java.util.Scanner;

public class A_Preparing_for_the_Olympiad{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for(int i=0;i<n;++i) a[i]=sc.nextInt();
            for(int i=0;i<n;++i) b[i]=sc.nextInt();

            int[][] dp = new int[n][2];

            dp[0][0] = 0;             
            dp[0][1] = a[0];          
            for (int i = 1; i < n; i++) {
                dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
                dp[i][1] = dp[i-1][0] + a[i];
                if (i + 1 < n) {
                    dp[i][1] -= b[i+1];
                }
            }
            System.out.println(Math.max(dp[n-1][0], dp[n-1][1]));
            --t;
        }
        sc.close();
    }
}