import java.util.Scanner;

public class A_Alyona_and_a_Square_Jigsaw_Puzzle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int[] pieces=new int[n];
            for(int i=0;i<n;++i) pieces[i]=sc.nextInt();

            int layers=0,remaining=0;
            for(int i=0;i<n;++i){
                if(i==0 && pieces[i]==1) {
                    //++happydays;
                    ++layers;
                }else{
                    int possibleLayers= (int) Math.sqrt(pieces[i]);
                    if(possibleLayers==2){
                        possibleLayers=3;
                    }
                    int totalpieces=(int) Math.pow(possibleLayers,2)-1;
                    if(totalpieces>(pieces[i]+remaining)){
                        remaining=(totalpieces-pieces[i]-remaining);
                        layers=possibleLayers-1;
                    }else if(totalpieces<pieces[i]){
                        layers=(possibleLayers);
                        remaining=(pieces[i]-totalpieces);
                    }else{
                        //++happydays;
                        layers=possibleLayers;
                        remaining=0;
                    }
                }
            }
            System.out.println(layers);
            --t;
        }
    }
}