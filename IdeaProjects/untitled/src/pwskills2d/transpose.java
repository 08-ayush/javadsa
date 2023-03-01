package pwskills2d;

import java.util.Scanner;

public class transpose {
    static void printarray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] transpose(int a[][], int r, int c) {
        int ans[][] = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = a[j][i];
            }
        }
        return ans;
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
        int[][] tp = transpose(a, r, c);
        printarray(tp);
    }
}