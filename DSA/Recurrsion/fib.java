public class fib {

    static int fibb(int n){
        if(n<2){
            return n;
        }
        return fibb(n-2) + fibb(n-1);
        
        
        
    }
    public static void main(String args[]) {
        System.out.println(fibb(6));

    }
    
}
