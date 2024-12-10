import java.util.Scanner;

public class A_Game_of_Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t> 0) {
            int n = sc.nextInt(); 
            int k = sc.nextInt(); 
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt(); 
            }

            boolean found = false;
            for (int i = 0; i < n; i++) {
                boolean valid = true;
                for (int j = 0; j < n; j++) {
                    if (i != j && Math.abs(a[i] - a[j]) % k == 0) {
                        valid = false; 
                        break;
                    }
                }
                if (valid) {
                    System.out.println("YES");
                    System.out.println(i + 1); 
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("NO");
            }
            --t;
        }

        sc.close();
    }
}
