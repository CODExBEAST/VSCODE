public class target {
    public static void main(String args[]) {
        int arr[]={1,2,3,9,4,5};
        System.out.println(targ(arr,0, 1));
    }
    static boolean targ(int arr[],int index,int target){
        if(index==arr.length){
            return false;
        }
        return arr[index] == target || targ(arr, index+1, target);
    }
}
 