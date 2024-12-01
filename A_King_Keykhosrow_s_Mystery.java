import java.util.Scanner;

public class A_King_Keykhosrow_s_Mystery{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();

            int m=lcm(a,b);
            System.out.println(m);
            --t;
        }
        sc.close();
    }
    private static int lcm(int a,int b){
        return (a*b)/(gcd(a,b));
    }

    private static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a % b;
            a=temp;
        }
        return a;
    }
}