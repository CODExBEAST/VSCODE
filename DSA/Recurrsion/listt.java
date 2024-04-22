import java.util.ArrayList;

public class listt {

    static ArrayList<Integer> findall(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index==arr.length-1){
            return list;
        }
        if(arr[index]== target){
            list.add(index);
        }
        return findall(arr, target, index+1,list);
    } 
    public static void main(String args[]) {
        int arr[]={1,2,3,4,4,5,4,5};
        ArrayList<Integer> ans = findall(arr, 4, 0,new ArrayList<>());
        System.out.println(ans);
    }
}
