import java.util.Arrays;
import java.util.Scanner;

public class revarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
//int arr[]={4,5,6,7,8};
int arr[]=new int[size];
for(int i=0;i<=arr.length-1;i++){
    arr[i]=sc.nextInt();
}
//swap(arr,0,4)
// ;
        reverse(arr);
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i] + " ");
}
//System.out.println(Arrays.toString(arr));

    }
    static void reverse(int []arr){
            int start=0;
            int end =arr.length-1;
            while(start<end){
                //swap
                swap(arr,start,end);
                start++;
                end--;
            }
    }
static void swap(int arr[],int index,int indexx){
        int temp=arr[index];
         arr[index]=arr[indexx];
arr[indexx]=temp;
}
}
