package pwskills;
import java .util.Scanner;
public class prefixsum_2indices1basedindexing {
    static int [] prefixsum(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n+1];
        for (int i = 1; i <=n; i++) {
            arr[i] = sc.nextInt();

        }
        int ant[] =prefixsum(arr);
       // System.out.println("enter the queries");
     //   int q= sc.nextInt();
   // while (q-- >0){
        System.out.println("enter the range");
        int l= sc.nextInt();
        int r=sc.nextInt();
int ans=ant[r]-ant[l-1];
        System.out.println("sum is " +ans);
    //}
    }
}
