import java.util.Scanner;

public class A_Line_Breaks{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n,m;
            n=sc.nextInt();
            m=sc.nextInt();
            String[] s=new String[n];
            for(int i=0;i<n;++i){
                s[i]=sc.next();
            }
            int l=0,i=0;
            while(i<n){
                l+=s[i].length();
                if(l>m) break;
                ++i;
            }
            System.out.println(i);
            --t;
        }
        sc.close();
    }
}