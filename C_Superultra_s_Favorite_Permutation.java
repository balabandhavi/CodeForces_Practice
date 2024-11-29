import java.util.Scanner;

public class C_Superultra_s_Favorite_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            
            if (n < 5) {
                System.out.println(-1);
                --t;
                continue;
            }

            for (int i = 2; i <= n; i += 2) {
                if (i != 4) {
                    System.out.print(i + " ");
                }
            }

            System.out.print("4 5 ");

            for (int i = 1; i <= n; i += 2) {
                if (i != 5) {
                    System.out.print(i + " ");
                }
            }

            System.out.println(); 
            --t; 
        }
        sc.close();
    }
}
