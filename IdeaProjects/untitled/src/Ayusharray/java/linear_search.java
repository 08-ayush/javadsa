package Ayusharray.java;
import java.util.*;
public class linear_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int key=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
              arr[i]=sc.nextInt();
        }

        int index=linear_search(arr,key);
        if(index==-1){
            System.out.println("not found");
        }
        else {
            System.out.println("key is at index" + " "+ index);
        }
    }
    public static int linear_search(int arr[],int key){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==key){
                return i;
            }

        }
        return -1;
    }
}
