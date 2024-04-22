import java.util.*;
public class findk {

    public static int[] find(int arr[],int n,int k){
        int ans[] = new int[2];

        for(int i=0;i<n;i++){
            
            for(int j=0;j<n;j++){
                if(arr[i]+arr[j]==k){
                    ans[0]=i;
                    ans[0]=j;
                }
            }
        }
        return ans;
        
    }


    public static void print(int n,int arr[]){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans[]= new int[2];
        int k= sc.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        
        print(n, arr);
        System.out.println("\n");
        find(arr, n, k);
        System.out.println(ans);
    }
}
