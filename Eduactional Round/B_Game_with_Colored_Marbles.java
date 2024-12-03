import java.util.HashMap;
import java.util.Scanner;

public class B_Game_with_Colored_Marbles{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            HashMap<Integer,Integer> count=new HashMap<>();
            for(int i=0;i<n;++i){
                int marble=sc.nextInt();
                count.put(marble,count.getOrDefault(marble, 0)+1);
            }
            int single=0,multiple=0;
            for(int m:count.keySet()){
                if(count.get(m)>1) ++multiple;
                else if(count.get(m)==1) ++single;
            } 
            int alice=2*((single/2)+(single%2))+multiple;
            System.out.println(alice);
            --t;
        }
        sc.close();
    }
}