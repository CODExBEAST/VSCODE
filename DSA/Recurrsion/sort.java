public class sort {
    public static void main(String args[]) {
        int arr[]={1,2,3,9,4,5};
        System.out.println(sorte(arr, 0));

    }
    static boolean sorte(int arr[],int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorte(arr, index+1);
    }

}
