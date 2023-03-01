package CodequotientPractice;
import java.util.*;
public class secapproachsecondmax {

    static int secondmax(int arr[]) {
        int larg1 = arr[0];
        int larg2 = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > larg1) {
                larg1 = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != larg1 && arr[i] > larg2) {
                larg2 = arr[i];

            }
        }
if(larg2!=Integer.MIN_VALUE){
    return larg2;
}
else
        return 0;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        // System.out.println("enter the no");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.print( secondmax(arr));
    }
}