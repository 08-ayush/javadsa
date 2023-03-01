package CodequotientPractice;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class leftrotation {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }

    static void reverse(int arr[], int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void leftrotation(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0,  k - 1);
        reverse(arr,  k, n - 1);
        reverse(arr, 0, n - 1);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        leftrotation(arr, k);
       // System.out.println(Arrays.toString(arr));
        //  arrayprint(arr);
        for(int i=0;i<arr.length;i++){

            //   ans[i]=ans[i];
            System.out.print(arr[i]+" ");
        }
    }
}
    /*
    static void arrayprint(int ans[]){
        int n=ans.length;
     //   System.out.println(Arrays.toString(arr));
for(int i=0;i<n;i++){

 //   ans[i]=ans[i];
    System.out.print(ans[i]+" ");
}
        System.out.println();
    }

    }

*/