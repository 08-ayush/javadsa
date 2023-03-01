package pwskills2d;
import java.util.Scanner;
public class sumrec_3method {
    static void prefixsum(int arr[][]){
        int r= arr.length;
        int c= arr[0].length;
        //now we calculate the horizontally row wise sum
        for (int i=0;i<r;i++){
            for (int j=1;j<c;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
        // now we traverse vertically to calculate column wise sum
        for (int j=0;j<c;j++){//column fixing
            for (int i=1;i<r;i++){
                arr[i][j]+=arr[i-1][j];
            }
        }

    }
    static int recsum(int arr[][],int r1,int c1,int r2,int c2)
    {

        int ans=0;
        int left=0,leftup=0,up=0,sum=0;
        prefixsum(arr);
         sum=arr[r2][c2];
         if(r1>=1&&c1>=1) {
             leftup = arr[r1 - 1][c1 - 1];
         }
  if(c1>=1) {
      left = arr[r2][c1 - 1];
  }
  if(r1>=1) {
      up = arr[r1 - 1][c2];
  }
ans=sum-left-up+leftup;
  return ans;
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
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

        //    System.out.print(tot);
        System.out.print(recsum(arr,r1,c1,r2,c2));
    }
}