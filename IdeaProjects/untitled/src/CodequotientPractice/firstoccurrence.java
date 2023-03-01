package CodequotientPractice;

import java.util.Arrays;
import java.util.Scanner;

public class firstoccurrence {
   // static int duplicates(int arr[],int k){
     //   int count=0;
       /* for (int i=0;i< arr.length-1;i++){

            if(arr[i]==k)
            {

               count=i;

return count;

            }
            else if(k== arr.length){
                return -1;

            }

        }
        return -1;
    }
*/
        static int duplicates(int arr[], int k) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == k && (i == 0 || arr[i - 1] != k)) {
                    return i;
                }
            }
            return -1; // return -1 if element is not found
        }


        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc .nextInt();
        int arr[]=new int [x];
        for (int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
         int ans= duplicates(arr,k);

     //    for(int i=0;i< arr.length;i++){
       //      System.out.println(ans[i]);
         //}
        System.out.println(ans);

    }
}
