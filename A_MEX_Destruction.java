import java.util.Scanner;

public class A_MEX_Destruction{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;++i) a[i]=sc.nextInt();

            int count=0;
            for(int i=0;i<n;++i){
                if(a[i]!=0 && (i==0 || a[i-1]==0)){
                    count+=1;
                }
            }
            System.out.println(count);
            --t;
        }
        sc.close();
    }
    
}