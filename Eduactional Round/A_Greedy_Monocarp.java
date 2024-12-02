
import java.util.Arrays;
import java.util.Scanner;


public class A_Greedy_Monocarp{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();
            int[] chests=new int[n];
            for(int i=0;i<n;++i){
                chests[i]=sc.nextInt();
            }
            Arrays.sort(chests);
            
            int coins=0;
            for(int i=n-1;i>=0;--i){
                if(coins+chests[i]>k) break;
                else {
                    coins+=chests[i];
                }
            }
            System.out.println(k-coins);
            --t;
        }
        sc.close();
    }

}
