package CodequotientPractice;
import java.util.Scanner;
public class rotatearray90degre {

    static void printarray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void transpose(int a[][], int r, int c) {
        for (int i=0;i<r;i++){
            for (int j=i;j<c;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }

    }
    static void reversearray(int []arr) {
        int i = 0, j = arr.length-1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotatearray(int  [][] matrix, int r,int c) {
        transpose(matrix, r, c);
//reverse each row of transpose  matrix
        for (int i = 0; i < r; i++) {
            reversearray(matrix[i]);
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
        rotatearray(a,r,c);
        printarray(a);
    }
}