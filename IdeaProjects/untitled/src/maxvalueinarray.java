import
 java.util.Scanner;
public class maxvalueinarray {
    public static void main(String[] args) {
        int arr[] = {1, 55, 85, 25, 44};
        int maxvalue = max(arr);
        System.out.print(maxvalue);
    }

    public static int max(int[] arr) {
        int maxval = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];

            }
        }
        return maxval;

    }
}
