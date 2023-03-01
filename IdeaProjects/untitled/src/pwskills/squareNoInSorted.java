package pwskills;
import java.util.*;
public class squareNoInSorted {
    static int[] sortArray(int [] arr){
        int n= arr.length;
        int ans[]=new int[n];
        int left=0 ,  right=n-1,k=n-1;
        while (left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k--]=arr[left]*arr[left];
                left++;
            }
            else {
                ans[k--]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int keep[]=sortArray(arr);
        System.out.println(Arrays.toString(keep));
    }
}
