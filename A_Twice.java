import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A_Twice{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int[] a =new int[n];
            for(int i=0;i<n;++i) a[i]=sc.nextInt();
            Map<Integer,Integer> count=new HashMap<Integer,Integer>();
            for(int e:a){
                count.put(e,count.getOrDefault(e,0)+1);
            }
            int sum=0;
            for(int k: count.values()){
                if(k>1){
                    sum+=(k/2);
                }
            }
            System.out.println(sum);
        --t;
        }
        sc.close();
    }
}