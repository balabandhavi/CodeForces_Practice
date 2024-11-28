import java.util.Scanner;

public class A_Watermelon{
    public A_Watermelon(int w){
    }

    public boolean canDivide(int weight){
        if(weight<4) return false;
        if(weight%2==0) return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        A_Watermelon a=new A_Watermelon(w);
        if(a.canDivide(w)){
            System.out.println("YES");
        }else 
        System.out.println("NO");
        sc.close();
    }
}
