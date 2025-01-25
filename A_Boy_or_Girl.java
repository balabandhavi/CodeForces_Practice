import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class A_Boy_or_Girl{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String id=sc.nextLine();

        Set<Character> distinct=new HashSet<>();

        for(char c:id.toCharArray()){
            distinct.add(c);
        }

        if(distinct.size()%2==0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");

        sc.close();
    }

    
}