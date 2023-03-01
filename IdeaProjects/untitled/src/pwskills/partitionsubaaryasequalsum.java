package pwskills;
import java.util.*;
public class partitionsubaaryasequalsum {
    static int findarraysumsum(int []arr){
        int totalsum=0;
        for(int i=0;i< arr.length;i++) {
             totalsum+=arr[i];
        }
        return totalsum;
    }
    static boolean equalsumpartiton(int arr[]){
       int totalsum=findarraysumsum(arr);
       // findarraysumsum(arr);
        int prefixsum=0;
for (int i=0;i<arr.length;i++) {
    prefixsum = prefixsum + arr[i];

    int suffixsum = totalsum - prefixsum;
    if (suffixsum == prefixsum) {
        return true;
    }
}

        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println(equalsumpartiton(arr));
    }

}
