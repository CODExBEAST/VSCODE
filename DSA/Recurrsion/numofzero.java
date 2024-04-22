public class numofzero {
    static int count =0;
    public static void main(String args[]) {
        System.out.println(countt(1000));
        
        
    }
    public static int countt(int n){
        if(n==0){
            return count;
        }
        else if(n%10==0){
            count++;
        }
        return countt(n/10);
    }


}
