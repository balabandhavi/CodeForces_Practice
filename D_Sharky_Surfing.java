import java.util.*;

public class D_Sharky_Surfing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(); 
            int m = sc.nextInt(); 
            int L = sc.nextInt(); 

            int[][] hurdles = new int[n][2];
            for (int i = 0; i < n; i++) {
                hurdles[i][0] = sc.nextInt();
                hurdles[i][1] = sc.nextInt();
            }

            int[][] powerUps = new int[m][2];
            for (int i = 0; i < m; i++) {
                powerUps[i][0] = sc.nextInt();
                powerUps[i][1] = sc.nextInt();
            }

            PriorityQueue<Integer> powerQueue = new PriorityQueue<>(Collections.reverseOrder());
            int minPowerUps = 0; 
            int currentPower = 1; 
            int currentPosition = 1; 

            int hurdleIndex = 0, powerUpIndex = 0;
            boolean canFinish = true;

            while (currentPosition < L) {
                while (powerUpIndex < m && powerUps[powerUpIndex][0] <= currentPosition) {
                    powerQueue.add(powerUps[powerUpIndex][1]);
                    powerUpIndex++;
                }

                if (hurdleIndex < n && hurdles[hurdleIndex][0] <= currentPosition) {
                    int hurdleStart = hurdles[hurdleIndex][0];
                    int hurdleEnd = hurdles[hurdleIndex][1];
                    int requiredPower = hurdleEnd - hurdleStart + 2;

                    while (currentPower < requiredPower && !powerQueue.isEmpty()) {
                        currentPower += powerQueue.poll();
                        minPowerUps++;
                    }

                    if (currentPower < requiredPower) {
                        canFinish = false;
                        break;
                    }

                    currentPosition = hurdleEnd + 1;
                    hurdleIndex++;
                } else {
                    currentPosition += currentPower;
                }
            }

            System.out.println(canFinish ? minPowerUps : -1);
        }

        sc.close();
    }
}
