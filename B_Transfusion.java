import java.util.Scanner;

public class B_Transfusion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            long[] a=new long[n];
            int sum=0;
            for(int i=0;i<n;++i) {
                a[i]=sc.nextInt();
                sum+=a[i];
            }

            if(sum%n !=0){
                System.out.println("NO");
                continue;
            }
            long target=sum/n;
            long d=0,s=0;
            for(int i=0;i<n;++i){
               if(a[i]<target) d+=(target-a[i]);
               else s+=(a[i]-target);
            }
            System.out.println(s>=d? "YES" : "NO");
            --t;
        }
        sc.close();
    }
}