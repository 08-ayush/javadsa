package Ayusharray.java;
import java.util.*;
public class maxelement {
    public static void main(String[] args) {
        int arr[] = {15, 2, 8, 9, 10, 11,88};
        int largest = maxelement(arr);
        if (largest == -1) {
            System.out.println("no you enter is wrong");
        } else {
            System.out.println(largest);
        }
    }
    public static int maxelement(int arr[]){
        int maximum=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(maximum<arr[i]){
                maximum=arr[i];

            }

                if(smallest>arr[i]){
                    smallest=arr[i];
                }



        }
        System.out.println(smallest);

        return maximum;
    }
}
