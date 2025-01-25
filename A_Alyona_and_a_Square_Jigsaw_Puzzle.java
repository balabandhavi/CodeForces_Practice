import java.util.Scanner;

public class A_Alyona_and_a_Square_Jigsaw_Puzzle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int[] pieces=new int[n];
            for(int i=0;i<n;++i) pieces[i]=sc.nextInt();
            
            int[] sum=new int[n];
            int current=0;
            for(int i=0;i<n;++i){
                current+=pieces[i];
                sum[i]+=current;
            }
            //int last = sum[0];
 
		    int layers = 1; 
		    for (int i = 1; i < sum.length; i++) {
			
			    double odd = Math.sqrt(sum[i]);
 
			    if(odd % 2 != 0 && (int)odd*(int)odd == sum[i])
			    {
				    layers++;
			    }			
	    	}
            System.out.println(layers);
            --t;
        }
        sc.close();
    }
}