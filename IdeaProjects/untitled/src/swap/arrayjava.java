
package swap;
import java.util.*;
public class arrayjava {
    public static void main(String[] args) {
        int arr[]={1,2,9,8,6};
         swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }

    public static   void swap(int arr[], int index1,int  index3) {
        int temp=arr[index1];
          arr[index1]=arr[index3];
       arr[index3]=temp;

    }
}
