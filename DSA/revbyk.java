import java.util.*;
public class revbyk {

    public static void revv(int n,int arr[],int k){
        for(int i=0;i<n;i++){
            if(i<=k){
                for(int j=k;j>=0;j--){
                    System.out.print(arr[j]+" ");
                }
                i=k;
            }

            else{
                System.out.print(arr[i]+" ");
            }
        }
         
    }


    public static void printt(int n,int arr[]){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        
        printt(n, arr);
        System.out.print("\n");
        revv(n, arr, k);
        
    }
}
