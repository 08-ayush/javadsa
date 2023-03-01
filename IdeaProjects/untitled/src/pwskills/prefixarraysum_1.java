package pwskills;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class prefixarraysum_1 {

    static int[] prefixsum(int arr[]){
        int n= arr.length;


        for(int i=1;i<n;i++){
            arr[i]=arr[i]+arr[i-1];

        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
    int ans[] =prefixsum(arr);
       // System.out.println(Arrays.toString(ans));
        for (int i=0;i<n;i++){
            arr[i]=ans[i];
            System.out.print(arr[i] +" ");
        }
    }
}
