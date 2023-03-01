package pwskills2d;

import java.util.Scanner;

public class multiplicationprogram {
    static void printarray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiplyM(int a[][],int r1,int c1,int b[][],int r2,int c2) {
        if (c1 != r2) {
            System.out.println("multiplication not posssible wrong dimension");
        }
        int[][] mull = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mull[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("entire ans is ");
        printarray(mull);
    }




        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the row no");
            int r1 = sc.nextInt();
            System.out.println("enter the column no");
            int c1 = sc.nextInt();
            int a[][] = new int[r1][c1];
            System.out.println("enter the values");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    a[i][j] = sc.nextInt();
                }

            }
            System.out.println("enter the no of rows and column of second matrix");
            System.out.println("enter the row");
            int r2 = sc.nextInt();
            System.out.println("enter the column");
            int c2 = sc.nextInt();
            System.out.println("enter the values");
            int b[][] = new int[r2][c2];
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    b[i][j] = sc.nextInt();
                }

            }
            multiplyM(a,r1,c1,b,r2,c2);
        }
}
