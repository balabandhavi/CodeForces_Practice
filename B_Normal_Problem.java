import java.util.Scanner;

public class B_Normal_Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            String a = sc.nextLine();
            StringBuilder b = new StringBuilder();

            for (int i = 0; i < a.length(); ++i) {
                char ch = a.charAt(i);
                if (ch == 'q') {
                    b.append('p'); 
                } else if (ch == 'p') {
                    b.append('q'); 
                } else {
                    b.append(ch); 
                }
            }
            b.reverse();
            System.out.println(b.toString());
            --t;
        }
        sc.close();
    }
}