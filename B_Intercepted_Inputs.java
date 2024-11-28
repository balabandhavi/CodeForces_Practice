import java.util.HashMap;
import java.util.Scanner;

public class B_Intercepted_Inputs{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int k=sc.nextInt();
            HashMap<Integer,Integer> a=new HashMap<>();
            for(int i=0;i<k;++i){
                int num=sc.nextInt();
                a.put(num,a.getOrDefault(num,0)+1);
            }
            int nm=k-2;
            for(int n:a.keySet()){
                int q=nm/n;
                if(nm%n==0){
                    if((q==n && a.get(n)>1) || (q!=n && a.containsKey(q))){
                    System.out.println(n+" "+q);
                    break;
                    }
                }
            }
            --t;
        }
        sc.close();
    }
}