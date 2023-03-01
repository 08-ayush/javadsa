package CodequotientPractice;
import javax.sound.midi.Soundbank;
import java.util.*;
public class Rotationofarray {
    static int[] rotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        int ans[] = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];

        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("original array");
        //printArray(arr);

        int k = sc.nextInt();
        int[] ans = rotate(arr, k);
          //printArray(ans);
        System.out.println(Arrays.toString(ans));

    }

   // private static void printArray(int[] ans) {
      //  for (int i = 0; i < ans.length; i++) {
            //ans[i] = ans[i];

          //  System.out.print(ans[i]+" ");
      //  }
      //  System.out.println(Arrays.toString(arr[i]));

   // }
}