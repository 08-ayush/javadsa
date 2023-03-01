package CodequotientPractice;
import java.util.Arrays;
import java .util.Scanner;
public class reverseanarraygroup {

static void printarray(int arr[]){
    for (int i=0;i< arr.length;i++){
        System.out.print(arr[i]+" ");
    }
  //  System.out.println();
}

    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int arr[],int i,int j){
        while (i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
//    static void reverse(int arr[],int k){
    static int[] reverse(int arr[],int k){
        int n= arr.length;
        int pair =n/k;                         //4 3 2 1 8 7 6 5 9
        int start=0;
        int end=k-1;
        for (int i=0;i<pair;i++){
            reverse(arr,start,end);
            start+=k;
            end+=k;
        }
        if(n%k!=0){
           reverse(arr,start,n-1);
         //   reverse(arr, start, Math.min(start+k-1, n-1));
        }
return arr;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter the no");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k=sc.nextInt();

  int a[]=reverse(arr,k);
      //  System.out.println(Arrays.toString(a));
printarray(a);


  }

    }

