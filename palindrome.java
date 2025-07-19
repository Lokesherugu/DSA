import java.util.*;
public class palindrome {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
            String n=sc.next();
            n=n.toLowerCase();
            StringBuilder sb=new StringBuilder(n);
            sb.reverse();
            if(sb.toString().equals(n)){
                System.out.println("palindrome");
            }else{
                System.out.println("not a palindrome");
            }
        sc.close();
    }
}

