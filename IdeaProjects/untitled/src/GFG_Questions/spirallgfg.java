package GFG_Questions;

import java.util.Scanner;

public class spirallgfg {




        static void printarray(int[][] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
        static void printmatrix(int arr[][],int r,int c,int k){
            int toprow=0,bottomrow=r-1,leftcol=0,rightcol=c-1;
            int totalelements=0;
            int count =1;
            while (totalelements< r*c){
                //top row=leftcol to rightcol
                for (int j=leftcol;j<=rightcol && totalelements<r*c;j++){

                    if(count==k){
                        System.out.print(arr[toprow][j] +" ");
                   //     break;
                    }


                    count++;
                    totalelements++;
                }
                toprow++;
                //rightcol=toprow to bottom row
                for (int i=toprow;i<=bottomrow && totalelements<r*c;i++){
                //    count++;
                    if(count==k){
                        System.out.print(arr[i][rightcol] + " ");
                     //   break;
                    }
                    count++;

                    totalelements++;
                }
                rightcol--;
                // bottom row=right col to left col
                for (int j=rightcol;j>=leftcol && totalelements<r*c;j--){
                  //  count++;
                    if(count==k){
                        System.out.print(arr[bottomrow][j] + " ");
                     //   break;
                    }

                    count++;
                    totalelements++;
                }
                bottomrow--;
                // ledft col=bottomrow to toprow
                for (int i=bottomrow;i>=toprow && totalelements<r*c;i--){
                   // count++;
                    if(count==k){
                        System.out.print(arr[i][leftcol] + " ");
                      // break;
                    }
                    count++;

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
            int k= sc.nextInt();
            printmatrix(a,r,c,k);

        }
    }

