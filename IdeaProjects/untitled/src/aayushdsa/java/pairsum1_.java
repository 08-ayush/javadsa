package aayushdsa.java;

import java.util.ArrayList;
import java.util.Scanner;

public interface pairsum1_ {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        list.add(sc.nextInt());
        int target=5;
        pairsum1(list,target);
        System.out.println(pairsum1(list,target));
    }
    public static boolean pairsum1(ArrayList<Integer>list, int targets ){
        for (int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                if(list.get(i)+list.get(j)==targets);
                return true;
            }
        }
        return false;
    }
}
