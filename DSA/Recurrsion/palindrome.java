public class palindrome {
    static int sum =0;
    public static void main(String args[]) {
        
        
    }
    // static boolean palin(int n){
    //     // return (n==rev(n));
    // }
    static void rev(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        rev(n/10);
    }
}
