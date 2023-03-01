package pwskills;
import java.util.Scanner;
public class rotatearray {
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
    static void rotatearray(int  [][] matrix, int n) {
        transpose(matrix, n, n);
//reverse each row of transpose  matrix
        for (int i = 0; i < n; i++) {
            reversearray(matrix[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraysize = sc.nextInt();
        //  System.out.println("enter the row no");
        while (arraysize > 0) {
            int n = sc.nextInt();
            // System.out.println("enter the column no");
            //  int c = sc.nextInt();
            int a[][] = new int[n][n];
            // System.out.println("enter the values");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }

            }
            rotatearray(a, n);
            printarray(a);
            arraysize--;
        }
    }
















}
