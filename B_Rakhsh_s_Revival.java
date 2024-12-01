import java.util.Scanner;


public class B_Rakhsh_s_Revival{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t > 0) {
            int n,m,k;
            n=sc.nextInt();
            m=sc.nextInt();
            k=sc.nextInt();
            String s=sc.next();
            int ptr = 0, sum = 0, ans = 0;
            while(ptr < n){
                if(s.charAt(ptr) == '0') sum++;
                else sum = 0;
                if(sum == m){
                          ans++;
                          ptr += k;
                          sum = 0;
                } else{
                          ptr++;
                }
            }
            System.out.println(ans);
            --t;

        }
        sc.close();
    }
}