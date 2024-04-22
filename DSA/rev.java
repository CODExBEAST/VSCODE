import java.util.*;
public class rev {
   
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rev =0;
        int num = sc.nextInt();
        while(num>0){
            int rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        System.out.println(rev);
        
    }
}
