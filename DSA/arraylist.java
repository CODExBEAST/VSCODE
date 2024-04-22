import java.util.ArrayList;
import java.util.*;

public class arraylist {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        // list.add(10);
        // list.add(20);
        // list.add(30); 
        // System.out.println(list);
        // System.out.println(list.get(1));
        // System.out.println(list.set(1,200));
        // System.out.println(list);
        while(true){
            int x = sc.nextInt();
            if(x==0){
                break;
            }
            list.add(x);
        }

        System.out.print(list);
        
  }
}
