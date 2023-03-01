package pwskills2d;
import java.util.*;
public class intilizationof2darray {
    static void printarray(int [][] arr,int n,int m){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row");
        int n=sc.nextInt();
        System.out.println("enter the column");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("enter"+n*m+ "element");
        for (int i=0;i< arr.length;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
printarray(arr,n,m);
    }
}
