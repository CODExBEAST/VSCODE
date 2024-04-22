public class pat2 {
    public static void main(String args[]) {
        tri(4,0 );
    }
    static void tri(int r,int c){
        if(r == 0){
            return;
        }
        if(c<r){
            System.out.print("*");
            tri(r+1, c);
            
        }
        else{
            System.out.println();
            tri(0, c-1);
        }
    }
}