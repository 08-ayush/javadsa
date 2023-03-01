package pwskills;
import java .util.Scanner;
public class sumofrecBrute {
    static int sumof_rec(int arr[][],int r1,int c1 ,int r2,int c2){
        int sum=0;
        for (int i=r1;i<=r2;i++){
            for (int j=c1;j<=c2;j++){
                sum+=arr[i][j];
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
