import java.util.*;
public class select {
    public static void rev(int n,int arr[],int k,int m){
    for(int i=0;i<n;i++){

        if(i>=k  && i<=m){

            for(int j=m;j>=k;j--){
                System.out.print(arr[j]+" ");
            }
            i=n-2;
        }

        else{
            System.out.print(arr[i]+" ");
        }
        
        
    }
}

public static void print(int arr[],int n){
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        int k = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        print(arr, n);
        System.out.print("\n");
        rev(n, arr, k, m);
    
        
    }
}