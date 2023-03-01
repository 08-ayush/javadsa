package Ayusharray.java;
import java.util.*;
public class lastoccurance {
    static void last_occurance(int []arr,int x){
       int temp[]=new int[8];
        int start=0;
        int j;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x) {
                temp[start]=arr[i];
start++;
            }
            for( j=0;j<arr.length;j++){
                arr[j]=temp[j];
                if(arr[j]==arr.length-1) {
                    System.out.print(arr[j]);
                }

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
      //  int temp[]=new int[10];
        System.out.println("enter" + n +"element");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
     //   int temp[]=new int[n];
        System.out.println("enter x element");
        int x=sc.nextInt();
     //   int start=0;
        int end=arr.length-1;
        last_occurance(arr,x);
      //  System.out.println(" last occurance is " + last_occurance(arr,x));
    }
}
