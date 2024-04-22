// import java.util.*;
// public class countFact {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int count =0;
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             if(n%i==0){
//                 count = count+1;
//             }
//         }
//         System.out.println(count);
//     }
// }



import java.util.*;
public class countFact {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        int n = sc.nextInt();
        for(int i=1;(i*i)<n;i++){
            if(n%i==0){
                count = count+1;
            }
        }
        System.out.println(count*2);
    }
}