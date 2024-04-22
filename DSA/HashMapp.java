import java.util.HashMap;
import java.util.Set;

public class HashMapp {
    public static void main(String args[]) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(10,50);
        hm.put(20,60);
        hm.put(30,60);
        hm.put(20,70);
        System.out.println(hm.get(20));
        
    }
}
