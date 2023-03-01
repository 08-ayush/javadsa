import java.util.Arrays;
import java.util.Scanner;

public class arrays_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
//        arr[0]=45;
//        arr[1]=12;
//        arr[2]=45;
//        arr[3]=66;
//        System.out.print(arr[3]);

        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
       /* for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        */
        System.out.println(Arrays.toString(arr));//internally it is usally for loop .
    }
}
