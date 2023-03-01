
import java.util.*;
public class twoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
//        output or printing
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] +" ");
//            }
//             System.out.println();
//for(int i=0;i< arr.length;i++){
//    System.out.println(Arrays.toString(arr[i]));
    for(int[] a : arr){
        System.out.println(Arrays.toString(a));
    }
        }
    }

