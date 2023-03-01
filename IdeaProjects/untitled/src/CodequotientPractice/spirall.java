package CodequotientPractice;
import java.util.Scanner;
public class spirall {

    static  void printarray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printmatrix(int arr[][],int r,int c){
        int toprow=0,bottomrow=r-1,leftcol=0,rightcol=c-1;
        int totalelements=0;
        while (totalelements< r*c){
            //top row=leftcol to rightcol
            for (int j=leftcol;j<=rightcol && totalelements<r*c;j++){
                System.out.print(arr[toprow][j] +" ");
totalelements++;
            }
            toprow++;
            //rightcol=toprow to bottom row
            for (int i=toprow;i<=bottomrow && totalelements<r*c;i++){
                System.out.print(arr[i][rightcol] +" ");
                totalelements++;
            }
            rightcol--;
            // bottom row=right col to left col
            for (int j=rightcol;j>=leftcol && totalelements<r*c;j--){
                System.out.print(arr[bottomrow][j]+ " ");
                totalelements++;
            }
            bottomrow--;
            // ledft col=bottomrow to toprow
            for (int i=bottomrow;i>=toprow && totalelements<r*c;i--){
                System.out.print(arr[i][leftcol] +" ");
                totalelements++;
            }
            leftcol++;
}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row no");
        int r = sc.nextInt();
        System.out.println("enter the column no");
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        System.out.println("enter the values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }

        }

        printmatrix(a,r,c);

      //  printarray(a);

    }
}

