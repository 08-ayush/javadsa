package arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylistswapp {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
    //    System.out.println("enter the no you want to swap");
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }

        System.out.println(list);
       // int index1=1;int index2=3;
        swap(list,1, 3);
        System.out.println(list);
    }
    public static void swap(ArrayList<Integer>lis, int indx1,int indx2){
        int temp=lis.get(indx1);
        lis.set(indx1,lis.get(indx2));
        lis.set(indx2,temp);




    }
}
