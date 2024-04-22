import java.util.Scanner;
public class rotate{

public static void revb(int arr[],int start,int end){
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
    
}

public static void rotatte(int arr[],int k){
    k=k%arr.length;
    revb(arr, 0, arr.length-1);
    revb(arr, 0, k-1);
    revb(arr, k, arr.length-1);


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
        int start =0;
        int arr[]=new int[n];
        int end = arr.length-1;
        
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        printt(n, arr);
        System.out.println('\n');
        rotatte(arr, k);
        System.out.println('\n');
        printt(n, arr);
    }
}
