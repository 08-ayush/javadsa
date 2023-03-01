package aayushdsa.java;

import java.util.ArrayList;
import java.util.Scanner;

public class pairsum_1twopointer {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int target = 12;
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
       list.add(sc.nextInt());
        }

//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);

//int s=       pairsum1(list, target);
        System.out.println(pairsum1(list, target));
     //   System.out.println(s);
    }

    public static boolean pairsum1(ArrayList<Integer> list, int targets) {
        int lp = 0;
        int rp = list.size() - 1;
//        while(lp!=rp){
            while(lp!=rp){
            if((list.get(lp)+ list.get(rp))==targets){
                return true;
            }
            if(list.get(lp)+list.get(rp)< targets){
                lp++;
            }
            else {
                rp--;
                }
        }
     return false;
    }
}
