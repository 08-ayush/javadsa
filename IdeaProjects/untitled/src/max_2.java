public class max_2 {


    public static void main(String[] args) {
        int arr[] = {1111, 55, 85, 25, 44};
        int maxvalue = maxrange(arr ,1,3);
        System.out.print(maxvalue);
    }

    public static int maxrange(int[] arr, int start,int end) {
        int maxval = arr[start];
        for (int i = start; i < arr.length; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];

            }
        }
        return maxval;

    }
}
