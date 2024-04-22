import java.util.Arrays;

public class selsort {
    public static void main(String args[]) {
        int [] arr={3,1,2,4,5};
        seleee(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void seleee(int []arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxindex = getmax(arr,0,last);
            swap(arr,maxindex,last);
        }
    }
    static void swap(int arr[],int first,int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]= temp;

    }
    public static int getmax(int arr[],int start,int e){
        int max = start;
        for(int i=start;i<=e;i++){
            if(arr[max]<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
