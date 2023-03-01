package GFG_Questions;
import java.util.Scanner;
public class missingnumber {
    static int guesssum(int arr[]){
        int guess=0;
        for(int i=0;i< arr.length;i++){
            guess=guess+arr[i];
        }
        return guess;
    }
    static int missingsum(int arr[],int m){
        int rough=0;
        int guess=guesssum(arr);
        for(int i=1;i<=m;i++){
            rough=rough+i;
        }
        int missno=rough-guess;
        return missno;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();

        }
        int m=sc.nextInt();
        int ans=missingsum(arr,m);

        System.out.println(ans);
    }
}
