package pwskills;

import java.util.Scanner;

public class printtspirallmatrix {
    static void  printarray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    static int[][] printmatrix(int n){
        int arr[][]=new int[n][n];
        int toprow=0,bottomrow=n-1,leftcol=0,rightcol=n-1;
        int curr=1;
        while (curr<=n*n){
            //top row=leftcol to rightcol
            for (int j=leftcol;j<=rightcol && curr<=n*n;j++){
                arr[toprow][j]=curr++;

            }
            toprow++;
            //rightcol=toprow to bottom row
            for (int i=toprow;i<=bottomrow && curr<=n*n;i++){
                arr[i][rightcol]  =curr++;

            }
            rightcol--;
            // bottom row=right col to left col
            for (int j=rightcol;j>=leftcol && curr<=n*n;j--){
                arr[bottomrow][j] =curr++;

            }
            bottomrow--;
            // ledft col=bottomrow to toprow
            for (int i=bottomrow;i>=toprow && curr<=n*n;i--){
                arr[i][leftcol]=curr++;

            }
            leftcol++;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row no");

        int n=sc.nextInt();

        int matrix[][]=   printmatrix(n);
        printarray(matrix);

    }
}
