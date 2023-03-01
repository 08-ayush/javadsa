package pwskills;
import java.util.Scanner;
public class sumrec_2method {


    static void prefixsum(int arr[][]){
        int r= arr.length;
        //use only when r>0
        int c=arr[0].length;
        //traverse row wise  to acutate row wise sum
        for (int i=0;i<r;i++){
            for (int j=1;j<c;j++){
                arr[i][j]+=arr[i][j-1];
                //same as 1D array arr[j]=arr[j-1];
            }
        }
    }
    static int sumof_rec(int arr[][],int r1,int c1 ,int r2,int c2){
int sum=0;
prefixsum(arr);
for (int i=r1;i<=r2;i++){
    if(r1>=1) {
        sum += arr[i][c2] - arr[i][c1 - 1];
    }
    else {
        sum+=arr[i][c2];
    }
}
return sum;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();

        int arr[][]=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int r1=sc.nextInt();
        int c1= sc.nextInt();
        int r2=sc.nextInt();

        int c2= sc.nextInt();
        // int tot= sumof_rec(arr,r1,c1,r2,c2);
        System.out.print( sumof_rec(arr,r1,c1,r2,c2));
        //    System.out.print(tot);
    }
}

