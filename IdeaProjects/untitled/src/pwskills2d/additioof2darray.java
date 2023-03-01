package pwskills2d;
import java.util.*;
public class additioof2darray {
    static void printarray(int [][] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void add(int a[][],int x,int y,int b[][],int x1,int y1){
        if(x!=x1||y!=y1){
            System.out.println("the value you enter is wrong");
        }
        int sum[][]=new int[x][x1];
for(int i=0;i<x;i++){
    for (int j=0;j<x1;j++){
        sum[i][j]=a[i][j]+b[i][j];

    }
}
printarray(sum);
    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("enter the row no");
        int x=sc.nextInt();
        System.out.println("enter the column no");
        int y=sc.nextInt();
        int a[][]=new int[x][y];
        System.out.println("enter the values");
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                 a[i][j]=sc.nextInt();
            }

        }
        System.out.println("enter the no of rows and column of second matrix");
        System.out.println("enter the row");
        int x1= sc.nextInt();
        System.out.println("enter the column");
        int y1= sc.nextInt();
        System.out.println("enter the values");
        int b[][]=new int[x1][y1];
        for(int i=0;i<x1;i++){
            for(int j=0;j<y1;j++){
                b[i][j]=sc.nextInt();
            }

        }
add(a,x,y,b,x1,y1);
    }
}
