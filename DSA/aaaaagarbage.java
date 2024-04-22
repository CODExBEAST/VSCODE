import java.util.*;
public class aaaaagarbage {


    public static void reverse (int n,int arr[]){
        
            for(int j=n-1;j>=0;j--){
                System.out.print(arr[j]+" ");
            }
}
    public static void printarr(int n,int arr[]){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        while(n>0){
            int rem = n%10;
            sum = sum+rem;
            product = product*rem;
            n=n/10;
        }
        System.out.println(sum);
        System.out.println(product);


        
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        printarr(n, arr);
        System.out.println("\n");
        reverse(n, arr);
        System.out.println("\n");
        


























        
    }
}
